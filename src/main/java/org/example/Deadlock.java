package org.example;

public class Deadlock {
    // Two resources
    private static final Object resource1 = "Resource-1";
    private static final Object resource2 = "Resource-2";

    public static void main(String[] args) {

        // Thread 1 locks resource1 then tries to lock resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                // Adding delay so that Thread 2 can lock resource2
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }

                System.out.println("Thread 1: Waiting to lock resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        // Thread 2 locks resource2 then tries to lock resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                // Adding delay so that Thread 1 can lock resource1
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }

                System.out.println("Thread 2: Waiting to lock resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }

}
