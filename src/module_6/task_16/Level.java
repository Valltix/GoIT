package module_6.task_16;

class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}

class Level {
    String LEVEL_NAME;

    public Level(String LEVEL_NAME) {
        this.LEVEL_NAME = LEVEL_NAME;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + LEVEL_NAME;
    }
}