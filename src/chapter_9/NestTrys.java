package chapter_9;

public class NestTrys {
    public static void main(String args[]) {
        int numer[] = {4,8,16,32,64,128,265,512};
        int denom[] = {2,0,4,4,0,8};

        try {
            for (int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i]/denom[i]);
                }
                catch (ArithmeticException exc) {
                    System.out.println("Попытка деления на нуль!");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Элемент не найден");
            System.out.println("Fatal error!!!");
        }
    }
}
