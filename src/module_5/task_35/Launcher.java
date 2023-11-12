package module_5.task_35;

class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    public void launch() {
        gasStation.refuel();
        serviceTower.service();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower{
    public void service(){
        System.out.println("Service done!");
    }
}