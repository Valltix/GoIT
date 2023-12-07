package module_11.task_1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HumanGenerator {

    public static List<Human> generate(int size) {
        Random r = new Random();

        List<String> names = List.of("Inna", "Vlad", "Dima", "Vova", "Anton", "Jose", "Petya");
        List<String> sNames = List.of("Gates", "Format", "Smith", "Haiba", "Biletov", "Nolan");

        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String name = names.get(r.nextInt(names.size()));
            String sName = sNames.get(r.nextInt(sNames.size()));

            Human human = new Human(name + " " + sName, r.nextInt(60)+10, r.nextInt(2500) + 500);
            humans.add(human);
        }

        return humans;
    }
}

