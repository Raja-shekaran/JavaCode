package practise;

import java.util.concurrent.*;

public class Practise4 {

    static volatile boolean running = true;  // NOT volatile

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (running) { }
            System.out.println("Stopped!");
        });
        t.start();

        Thread.sleep(1000);
        running = false;  // thread may NEVER see this update
    }
}
