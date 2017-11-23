package Chapter_6;

class Stack {
    private char q[];
    private int toc;

    Stack(int size) {
        q = new char[size];
        toc = 0;
    }

    Stack(Stack ob) {
        toc = ob.toc;
        q = new char[ob.q.length];
        for (int i = 0; i < toc; i++) {
            q[i] = ob.q[i];
        }
    }

    Stack(char ch[]) {
        q = new char[ch.length];
        for (char aCh : ch) {
            push(aCh);
        }
    }

    void push(char ch) {
        if (toc == q.length) {
            System.out.println("Стек заполнен");
            return;
        }
        q[toc] = ch;
        toc++;
    }

    char pop() {
        if (toc == 0) {
            System.out.println("Стук пуст");
            return (char) 0;
        }
        toc--;
        return q[toc];
    }
}

public class StDemo {
    public static void main(String args[]) {
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};

        Stack stk2 = new Stack(name);

        char ch;

        for (int i = 0; i < 10; i++) {
            stk1.push((char)('A' + i));
        }

        Stack stk3 = new Stack(stk1);

        System.out.println("Stk1:");
        for (int i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch + " ");
        }

        System.out.println("\nStk2");
        for (int i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch + " ");
        }

        System.out.println("\nStk3");
        for (int i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch + " ");
        }
    }
}
