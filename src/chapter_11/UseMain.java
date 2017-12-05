package chapter_11;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        thrd = Thread.currentThread();

        System.out.println("Name of main thread: " +
        thrd.getName());

        System.out.println("Priority of main thread " +
        thrd.getPriority());

        System.out.println();

        System.out.println("Set name and priority\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("New name of main thread: " +
                thrd.getName());

        System.out.println("New priority of main thread " +
                thrd.getPriority());


    }
}
