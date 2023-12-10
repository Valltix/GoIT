package module_13;

import com.google.gson.*;
import java.io.*;


public class FileUtil {
    public static void writeToFile(String fileName, String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/module_13/"+fileName))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Object jsonObject = new Gson().fromJson(content, Object.class);
            String formattedJson = gson.toJson(jsonObject);

            writer.println(formattedJson);
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + fileName, e);
        }
    }
}
