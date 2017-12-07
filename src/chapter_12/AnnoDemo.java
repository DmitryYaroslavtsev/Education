package chapter_12;

@Deprecated
class MyClass {
    private String msg;

    MyClass(String msg) {
        this.msg = msg;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }
}

public class AnnoDemo {
    public static void main(String[] args) {
        MyClass myObj = new MyClass("test");

        System.out.println(myObj.getMsg());
    }
}
