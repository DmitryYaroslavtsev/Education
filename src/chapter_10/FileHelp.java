package chapter_10;

import sun.text.normalizer.CharTrie;

import javax.naming.ldap.Rdn;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Help {
    String helpfile;

    Help(String fname) {
        helpfile = fname;
    }

    boolean helpon(String what) {
        int ch;
        String topic, info;

        try (BufferedReader helpRdr = new BufferedReader(
                new FileReader(helpfile))) {
            do {
                ch = helpRdr.read();
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);

        } catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к файлу справки");
            return false;
        }
        return false;
    }

    String getSection() {
        String topic = "";

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Укажите тему: ");
        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении с консоли");
        }
        return topic;
    }
}

public class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("Help");
        String topic;
        System.out.println("Воспользуйтесь справичной системой. \n" +
        "Для выхода из системы введите 'stop'.");

        do {
            topic = hlpobj.getSection();

            if (!hlpobj.helpon(topic))
                System.out.println("Тема не найдена.\n");
        } while (topic.compareTo("stop") != 0);
    }
}
