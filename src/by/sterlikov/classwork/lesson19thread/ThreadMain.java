package by.sterlikov.classwork.lesson19thread;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Hello world1");
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name: " + threadName);
        Thread.currentThread().setName("My super name");
        System.out.println("New name thread " + Thread.currentThread().getName());
        System.out.println("is a live: " + Thread.currentThread().isAlive());  // живой ли поток
        System.out.println("is a live: " + Thread.currentThread().isInterrupted());
        try {
            Thread.sleep(5000); // останавливаем поток на 5 сек // обернуть в try
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world2");
    }
}
