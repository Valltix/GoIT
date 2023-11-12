package module_10.task_1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class FileHandler {
    public static void main(String[] args) {
        String filePath = "src/module_10/task_1/files/file.txt";

        try {
            createFileIfNotExists(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readNumbersFromFile(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nDo you want to delete file \"file.txt\" 'Y' or 'N' ?");
        Scanner scanner = new Scanner(System.in);

        String response = scanner.next();
        if ("y".equalsIgnoreCase(response)) {
            deleteFileAndDir(filePath);
        }


    }

    public static void readNumbersFromFile(String filePath) throws FileNotFoundException {


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String phone;
            while ((phone = reader.readLine()) != null) {
                if (checkIsValidPhoneNumber(phone)) {
                    System.out.println(phone);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean checkIsValidPhoneNumber(String phoneNumber) {
        Pattern pattern1 = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}");
        Pattern pattern2 = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");

        Matcher matcher1 = pattern1.matcher(phoneNumber);
        Matcher matcher2 = pattern2.matcher(phoneNumber);

        return matcher1.matches() || matcher2.matches();
    }

    public static void createFileIfNotExists(String filePath) throws IOException {
        File file = new File(filePath);

        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created: " + filePath);
        } else {
            System.out.println("File already exists: " + filePath);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("987-123-4567\n");
            writer.write("123 456 7890\n");
            writer.write("(123) 456-7890\n");

        }
    }

    public static void deleteFileAndDir(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted: " + filePath);
            } else {
                System.out.println("Failed to delete the file: " + filePath);
            }
        } else {
            System.out.println("File does not exist: " + filePath);
        }
    }

}
