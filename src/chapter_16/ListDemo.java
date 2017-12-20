package chapter_16;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ListDemo implements ListSelectionListener {

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrp;

    String names[] = {"Sherry", "Jon", "Rachel",
                      "Sasha", "Josselyn", "Randy",
                      "Tom", "Marry", "Ken",
                      "Andrew", "Matt", "Todd" };

    ListDemo() {
        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlst = new JList<>(names);
        //jlst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jscrp = new JScrollPane(jlst);
        jscrp.setPreferredSize(new Dimension(120, 90));

        jlab = new JLabel("Please choose a name");

        jlst.addListSelectionListener(this);

        jfrm.add(jscrp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent le) {
        int[] idx = jlst.getSelectedIndices();
        StringBuilder str = new StringBuilder();
        if (idx[0] != -1) {
            for (int i: idx) {
                str.append(names[i]).append(" ");
            }
            jlab.setText("Current selection: " + str);
        }
        else jlab.setText("Please choose a name");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ListDemo::new);
    }
}
