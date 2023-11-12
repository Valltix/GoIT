package module_10.task_3;
import java.io.*;
import java.util.*;

public class WordFreq {
    public static void main(String[] args) {
        String fileName = "src/module_10/task_3/word.txt";

        try {
            Map<String, Integer> wordFrequency = countWordFrequency(fileName);
            printWordFrequency(wordFrequency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Integer> countWordFrequency(String fileName) throws IOException {
        Map<String, Integer> wordFrequency = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
        }

        return wordFrequency;
    }

    private static void printWordFrequency(Map<String, Integer> wordFrequency) {
        wordFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
