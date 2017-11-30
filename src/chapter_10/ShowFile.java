package chapter_10;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) {
                   System.out.println((char)i);
               }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода" + exc);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}

