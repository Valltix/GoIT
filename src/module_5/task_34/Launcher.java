package module_5.task_34;

class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    public void launch() {
        gasStation.refuel();
    }
}

class GasStation{
    public void refuel(){
        System.out.println("Refuel done!");
    }
}

