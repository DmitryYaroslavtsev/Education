package chapter_8;

public class SeriesDemo2 {
    public static void main(String args[]) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Nexr value of ByTwos: " + ob.getNext());

            ob = threeOb;
            System.out.println("Nexr value of ByThrees: " + ob.getNext());
        }
    }
}
