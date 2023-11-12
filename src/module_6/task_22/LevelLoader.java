package module_6.task_22;

class LevelLoader {
    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

    static private LevelLoader instance = new LevelLoader();

    static public LevelLoader getInstance(){
        return instance;
    };
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}