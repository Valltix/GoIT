package module_11.task_3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
