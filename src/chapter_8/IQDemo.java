package chapter_8;

class QueueFullException extends Throwable {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди " + size;
    }
}

class QueueEmptyException extends Throwable {
    public String toString() {
        return "Очередь пуста";
    }
}


class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if (putloc == q.length - 1) {
            throw new QueueFullException(q.length -1);
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        getloc++;
        return q[getloc];
    }
}

class CirqularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CirqularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if ((putloc+1 == getloc) | ((putloc == (q.length-1)) & (getloc == 0))) {
            System.out.println("Очередь заполнена");
            return;
        }

        putloc++;
        if (putloc == q.length) putloc = 0;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }
}

class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length -1) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (putloc == getloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

public class IQDemo {
    public static void main(String args[]) {
        FixedQueue q = new FixedQueue(10);
        char ch;

        try {
            for (int i = 0; i < 11; i++) {
                System.out.print("Try to save: " + (char)('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 11; i++) {
                System.out.print("Try to out: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
