package module_12.task_2;

public class ReplaceValue {
    private int n;
    private int curIndex = 1;

    public ReplaceValue(int n) {
        this.n = n;
    }

    public synchronized void fizz() {
        while (curIndex <= n) {
            if (curIndex % 3 == 0 && curIndex % 5 != 0) {
                System.out.println("fizz");
                curIndex++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void buzz() {
        while (curIndex <= n) {
            if (curIndex % 3 != 0 && curIndex % 5 == 0) {
                System.out.println("buzz");
                curIndex++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void fizzbuzz() {
        while (curIndex <= n) {
            if (curIndex % 15 == 0) {
                System.out.println("fizzbuzz");
                curIndex++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void number() {
        while (curIndex <= n) {
            if (curIndex % 3 != 0 && curIndex % 5 != 0) {
                System.out.println(curIndex);
                curIndex++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
