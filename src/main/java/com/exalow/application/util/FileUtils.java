package com.exalow.application.util;

import com.exalow.application.model.Project;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class FileUtils {
    private static Gson gson = createCustomGsonInstance();

    public static Gson createCustomGsonInstance() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .serializeNulls()
                .create();
    }

    public static String loadContent(File file) {

        StringBuilder content = new StringBuilder();

        try {

            final BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void saveContent(File file, String str) {

        try {

            final PrintWriter writer = new PrintWriter(new FileWriter(file));
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String serialize(Object object) {
        return gson.toJson(object);
    }

    public static Object deserialize(String json, Object type) {

        if (type.getClass() == Project.class) {
            return gson.fromJson(json, Project.class);
        }

        return null;
    }
}
