package module_6.task_10;

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());
        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}
class Distance{
    int startX, startY, endX, endY;
    Distance(int startX, int startY, int endX, int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public int getDistance() {
        int deltaX = endX - startX;
        int deltaY = endY - startY;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return (int) Math.round(distance);
    }
}