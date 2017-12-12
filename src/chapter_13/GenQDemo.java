package chapter_13;

public class GenQDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Demo");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add " + i +
                        " to queue q");
                q.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Get next value of Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);

        Double dVal;

        System.out.println("For Double");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add " + (double)i/2 +
                        " to queue q2");
                q2.put((double)i/2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Get next value of Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
