package chapter_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {
    public static void main(String[] args) {
        String s;

        try (BufferedReader reader = new BufferedReader(
                new FileReader("testdata"))) {
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода "+ exc);
        }
    }
}
