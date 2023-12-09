package module_12.task_1;

public class MainThread {
    public static void main(String[] args) {
        long startAppTS = System.currentTimeMillis();

        new Thread(() -> {
            while (!Thread.interrupted()) {
                System.out.println("Thread 1: " + ((System.currentTimeMillis() - startAppTS) / 1000) + " секунд з запуску");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Минуло 5 секунд");
            }
        }).start();
    }
}

