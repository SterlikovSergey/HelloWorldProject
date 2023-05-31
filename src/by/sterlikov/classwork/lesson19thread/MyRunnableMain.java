package by.sterlikov.classwork.lesson19thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyRunnableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRunnable myRunnable = new MyRunnable(new Counter());
        Thread thread = new Thread(myRunnable);
        thread.start();
        new Thread( () -> System.out.println("Hello world"));

        MyCallable callable = new MyCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(10); //хотим задействовать 10 потоков
        Future<String> result = executorService.submit(callable);
        System.out.println("here");
        System.out.println("result " + result.get());
    }
}
