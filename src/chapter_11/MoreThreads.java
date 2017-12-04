package chapter_11;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread1 mt1 = new MyThread1("Child #1");
        MyThread1 mt2 = new MyThread1("Child #2");
        MyThread1 mt3 = new MyThread1("Child #3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");

            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
    }
}
