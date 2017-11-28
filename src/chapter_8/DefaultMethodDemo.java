package chapter_8;

class MyIFImp implements MyIF {
    public int getUserID() {
        return 100;
    }
}

class MyIFImp2 implements MyIF {
    @Override
    public int getUserID() {
        return 100;
    }

    @Override
    public int getAdminID() {
        return 42;
    }
}

public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();

        System.out.println("User: " + obj.getUserID());
        System.out.println("Admin: " + obj.getAdminID());
        System.out.println("Admin2: " + obj2.getAdminID());
    }
}
