package chapter_11;

class MyTread implements Runnable {
    String thrdName;

    MyTread(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + " - запуск");

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("B " + thrdName +
                ", счетчик: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " - прерван");
        }
        System.out.println(thrdName + " - завершение");
    }
}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyTread mt = new MyTread("Child #1");

        Thread newThread = new Thread(mt);

        newThread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println("Завершение основного потока");
    }
}
