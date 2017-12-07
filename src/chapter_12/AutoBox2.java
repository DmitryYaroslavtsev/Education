package chapter_12;

public class AutoBox2 {
    public static void main(String[] args) {

        Integer iOb, iOb2;
        int i;

        iOb = 99;
        System.out.println("iOb: " + iOb);

        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        iOb +=10;
        System.out.println("After iOb += 10: " + iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after operation: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i after: " + i);

        iOb = 2;

        switch (iOb) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
                default:
                    System.out.println("Error");
        }
    }
}
