import java.time.Duration;

class Task extends Thread {
    private String task;
    Task(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task + " is being executed by " + Thread.currentThread().getName());
    }
}

class RTask extends Thread {
    private String task;
    RTask(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task + " is being executed by R " + Thread.currentThread().getName());
    }
}

class Counter {
    private int count = 0;
    public synchronized void inc() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}

public class multi {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread th1 = new Task("Learn Java");
        Thread th2 = new Thread(new RTask("Learn Python"));
        Thread th3 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.inc();
            }
        });
        Thread th4 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.inc();
            }
        });
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th3.join();
        th4.join(); // wait
        System.out.println(c.getCount());
        //th1.sleep(Duration.ofSeconds(2));
    }
}
