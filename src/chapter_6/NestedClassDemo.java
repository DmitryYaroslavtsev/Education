package chapter_6;

class Outer {
    private int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void Analize() {
        Inner inOb = new Inner();

        System.out.println("min: " + inOb.min());
        System.out.println("max: " + inOb.max());
        System.out.println("avg: " + inOb.avg());
    }

    class Inner {
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) m = nums[i];
            }
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (m < nums[i]) m = nums[i];
            }
            return m;
        }

        int avg() {
            int a = 0;
            for (int i: nums) {
                a += i;
            }
            return a/nums.length;
        }
    }
}

public class NestedClassDemo {
    public static void main(String args[]) {
        int a[] = {1,2,9,6,7,3};

        Outer o = new Outer(a);
        o.Analize();
    }
}
