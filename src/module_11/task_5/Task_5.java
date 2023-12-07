package module_11.task_5;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Task_5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> listA = new java.util.ArrayList<>(first.toList());
        List<T> listB = second.toList();

        //for random merge
        Collections.shuffle(listA);

        long minSize = Math.min(listA.size(), listB.size());

        return Stream.iterate(0, x -> x + 1)
                .limit(minSize * 2)
                .map(i -> i % 2 == 0 ? listA.get(i / 2) : listB.get(i / 2));
    }

    public static void main(String[] args) {
        Stream<Integer> a = Stream.of(8, 6, 3, 4, 10, 9, 3);
        Stream<Integer> b = Stream.of(1, 2, 7, 5);

        zip(a, b).forEach(System.out::println);

    }
}
