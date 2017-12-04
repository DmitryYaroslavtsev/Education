package chapter_11;

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread1 mt1 = new MyThread1("Child #1");
        MyThread1 mt2 = new MyThread1("Child #2");
        MyThread1 mt3 = new MyThread1("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child #1 - done");
            mt2.thrd.join();
            System.out.println("Child #2 - done");
            mt3.thrd.join();
            System.out.println("Child #3 - done");
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
