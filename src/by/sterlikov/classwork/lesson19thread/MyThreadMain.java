package by.sterlikov.classwork.lesson19thread;

import java.time.LocalDateTime;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start: " + LocalDateTime.now());
        MyThread thread1 = new MyThread("first");
        MyThread thread2 = new MyThread("second");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thread1.getState());
        MyThread thread3 = new MyThread("third");
        thread3.setDaemon(true);// поток демон выключит все потоки демона // в потоке включена пауза но она прервана демоном

        thread1.start();
        System.out.println(thread2.getState());
        System.out.println(thread1.isAlive());
        thread2.start();

        thread1.join(); //пока не закончится thread2 не начнётся следующий
        thread3.start();
        //thread3.interrupt(); // закрыться по возможности

/*        new Thread(() -> {
            while (true){
                System.out.println("spam");
            }
        }).start();*/
        System.out.println("state thread3 " + thread3.getState());

        System.out.println("End: " + LocalDateTime.now());
        System.out.println(thread1.getCount());
    }
}
