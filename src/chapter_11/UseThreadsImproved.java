package chapter_11;

class MyThread1 implements Runnable {
    Thread thrd;

    MyThread1(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }
    public void run() {
        System.out.println(thrd.getName() + " - запуск");

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() +
                        ", счетчик " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}

public class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread1 mt = new MyThread1("Child #1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание осноного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
