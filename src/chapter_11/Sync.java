package chapter_11;

class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]) {
        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Sum for " +
                    Thread.currentThread().getName() + " " +
            sum);

            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основоного потока");
            }
        }
        return sum;
    }
}

class MyThread3 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MyThread3(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск");
        answer = sa.sumArray(a);
        System.out.println("СУММА для " + thrd.getName() +
        " : " + answer);

        System.out.println(thrd.getName() + " - завершение");
    }
}

public class Sync {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        MyThread3 mt1 = new MyThread3("Child #1", a);
        MyThread3 mt2 = new MyThread3("Child #2", a);
    }
}
