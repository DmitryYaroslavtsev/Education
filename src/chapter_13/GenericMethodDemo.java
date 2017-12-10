package chapter_13;

public class GenericMethodDemo {

    static <T extends Comparable<T>, V extends T> boolean
    arraysEqual(T[] x, V[] y) {
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i]))
                return false;

        } return true;
    }

    public static void main(String[] args) {

        Integer nums1[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,2,7,4,5};
        Integer nums4[] = {1,2,7,4,5,6};

        if (arraysEqual(nums1, nums1))
            System.out.println("nums1 равен nums1");

        if (arraysEqual(nums1, nums2))
            System.out.println("nums1 равен nums2");

        if (arraysEqual(nums1, nums3))
            System.out.println("nums1 равен nums3");

        if (arraysEqual(nums1, nums4))
            System.out.println("nums1 равен nums4");

        //Double dvals[] = {1.1,2.2,3.3,4.4,5.5};
    }
}
