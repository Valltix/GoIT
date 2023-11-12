package module_6.task_17;

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
    }
}
class Level {
    String LEVEL_NAME;
    Point[] points;
    static int POINT_COUNT = 0;

    public Level(String levelName, Point[] points) {
        this.LEVEL_NAME = levelName;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + LEVEL_NAME + ", point count is " + POINT_COUNT;
    }

    static class Point{
        {POINT_COUNT++;}
        private int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}