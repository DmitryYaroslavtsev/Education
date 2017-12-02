package chapter_10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("End of write - \".\"");

        try (FileWriter fw = new FileWriter("testdata")) {
            do {
                str = reader.readLine();

                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода "+ exc);
        }
    }
}
