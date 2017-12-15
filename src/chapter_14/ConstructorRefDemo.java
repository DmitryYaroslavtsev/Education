package chapter_14;

interface MyFunc1 {
    MyClass func(String str);
}

class MyClass {
    private String str;

    MyClass(String str) {
        this.str = str;
    }

    MyClass() {
        str = "";
    }

    String getStr() {return str;}
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc1 myClassCons = MyClass::new;

        MyClass mc = myClassCons.func("Test");

        System.out.println("String str in mc: " + mc.getStr());
    }
}
