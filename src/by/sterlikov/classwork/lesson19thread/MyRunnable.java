package by.sterlikov.classwork.lesson19thread;

public class MyRunnable implements Runnable{
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++){
            try {
                counter.increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
