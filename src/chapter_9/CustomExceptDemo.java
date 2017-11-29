package chapter_9;

class NonIntResultException extends Exception {
    int n,d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }
    public String toString() {
        return "The result of " + n + " / " + d + " not int";
    }
}

public class CustomExceptDemo {
    public static void main(String[] args) {
        int numer[] = {4,8,15,32,64,127,256,512};
        int denom[] = {2,0,4,4,0,8};

        for (int i = 0; i < numer.length; i++) {
            try {
                if (numer[i]%2 !=0) throw new NonIntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("Div by zero");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Out of index");
            }
            catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
