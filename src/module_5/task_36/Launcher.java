package module_5.task_36;

class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation{
    public void compress(){
        System.out.println("Compress done!");
    }
}