package chapter_11;

class MyThread2 extends Thread {

    MyThread2(String name) {
        super(name);
        start();
    }
    public void run() {
        System.out.println(getName() + " - запуск");

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("B " + getName() +
                        ", счетчик " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " - прерван");
        }
        System.out.println(getName() + " - завершение");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread2 mt = new MyThread2("Child #1");

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
