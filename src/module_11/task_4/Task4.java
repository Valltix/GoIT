package module_11.task_4;

import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        generateRandomStream(a, c, m);
    }
    private static void generateRandomStream(long a, long c, long m) {
        Stream.iterate(System.currentTimeMillis(), x -> (a * x + c) % m).limit(10).forEach(System.out::println);
    }
}
