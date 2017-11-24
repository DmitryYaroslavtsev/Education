package Chapter_7;

class First {
    First() {
        System.out.println("First");
    }
}

class Second extends First {
    Second() {
        System.out.println("Second");
    }
}

class Third extends Second {
    Third() {
        System.out.println("Third");
    }
}

public class OrderConstruction {
    public static void main(String args[]) {
        Third third = new Third();
    }
}
