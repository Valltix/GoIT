package module_10.task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

import java.util.ArrayList;
import java.util.List;



public class FileToJsonConverter {

    public static void main(String[] args) {
        String inputFile = "src/module_10/task_2/file.txt";
        String outputFile = "src/module_10/task_2/user.json";

        try {
            List<User> userList = readUsersFromFile(inputFile);
            writeUsersToJsonFile(userList, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<User> readUsersFromFile(String fileName) throws IOException {
        List<User> userList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String header = reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                User user = new User();
                user.setName(parts[0]);
                user.setAge(Integer.parseInt(parts[1]));
                userList.add(user);
            }
        }

        return userList;
    }

    private static void writeUsersToJsonFile(List<User> userList, String fileName) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(userList, writer);
        }

        System.out.println("Users written to " + fileName);
    }
}
