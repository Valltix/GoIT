package module_11.task_1_2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MainStream {
    public static void main(String[] args) {
        List<Human> humans = HumanGenerator.generate(20);
        /*
        System.out.println("_______________ DefaultAllList _______________");
        humans.forEach(System.out::println);
        */
        System.out.println("_______________ Task - 1 _______________");
        oddNameEnumerated(humans);
        System.out.println("_______________ Task - 2 _______________\n");
        transformAndSort(humans);
        System.out.println("_______________ End _______________\n");
    }

    private static void oddNameEnumerated(List<Human> humans) {
        List<String> enumeratedNames = IntStream.range(0, humans.size())
                .filter(index -> index % 2 == 1)
                .mapToObj(index -> String.format("%d. %s", index, humans.get(index).getName()))
                .toList();
        enumeratedNames.forEach(System.out::println);
    }

    private static void transformAndSort(List<Human> humans) {
        List<String> transformAndSortNames = humans.stream()
                .map(Human::getName)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        transformAndSortNames.forEach(System.out::println);
    }

}

