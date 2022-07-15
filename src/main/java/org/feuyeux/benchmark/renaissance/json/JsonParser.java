package org.feuyeux.benchmark.renaissance.json;

import com.google.gson.*;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class JsonParser {
    @Getter
    private final Gson gson = new Gson();
    @Getter
    private final Gson prettyGson = new GsonBuilder().setPrettyPrinting()
            .registerTypeAdapter(LocalDateTime.class, (JsonSerializer<LocalDateTime>) (src, typeOfSrc, context) -> new JsonPrimitive(src.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))))
            .registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>) (src, typeOfSrc, context) -> new JsonPrimitive(src.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))))
            .registerTypeAdapter(LocalDateTime.class, (JsonDeserializer<LocalDateTime>) (json, type, jsonDeserializationContext) -> {
                String datetime = json.getAsJsonPrimitive().getAsString();
                return LocalDateTime.parse(datetime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            }).registerTypeAdapter(LocalDate.class, (JsonDeserializer<LocalDate>) (json, type, jsonDeserializationContext) -> {
                String datetime = json.getAsJsonPrimitive().getAsString();
                return LocalDate.parse(datetime, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            }).create();

    public void save(String path, Object obj) {
        File file = new File(path);
        if (!file.exists()) {
            boolean b = false;
            try {
                b = file.createNewFile();
            } catch (IOException e) {
                log.error("", e);
            }
            log.debug("{}", b);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            String json = prettyGson.toJson(obj);
            writer.write(json);
        } catch (Exception e) {
            log.error("", e);
        }
    }

    public <T> T read(String path, Type type) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            return prettyGson.fromJson(reader, type);
        } catch (IOException e) {
            return null;
        }
    }
}
