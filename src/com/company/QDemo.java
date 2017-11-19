package com.company;

class Queue {
    char q[];
    int n[];
    boolean b[];
    int putloc, getloc;

    Queue(int size, int type) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }
    void put(int num) {
        if (putloc == n.length-1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        n[putloc] = num;
    }

    void put(boolean bo) {
        if (putloc == b.length-1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        b[putloc] = bo;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}

public class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100, 1);
        Queue smallQ = new Queue(4, 1);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");

        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.println("Содержимое очереди bigQ");

        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char)0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");

        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (char)('Z' - i));
            smallQ.put((char)('Z' - i));
            System.out.println();
        }

        System.out.println("Содержимое smallQ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char)0) System.out.print(ch);
        }

    }
}