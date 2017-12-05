package chapter_11;

class MyThread5 implements Runnable {
    Thread thrd;

    private volatile boolean suspended;
    private volatile boolean stopped;

    MyThread5(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized(this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - выход");
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

public class Suspend {
    public static void main(String[] args) {
        MyThread5 ob1 = new MyThread5("My thread");

        try {
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Остановка потока");
            ob1.mystop();

        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        try {
            ob1.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        System.out.println("Выход из основного потока");
    }
}
