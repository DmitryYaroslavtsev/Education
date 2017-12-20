package chapter_16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {

    JTextField jtfFirst;
    JTextField jtfSecond;

    JButton jbtnComp;

    JLabel jlabFirst, jlabSecond;
    JLabel jlabResult;
    JLabel jlabPos;
    JCheckBox jcbx;

    SwingFC() {
        JFrame jfrm = new JFrame("Compare files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200,250);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        jbtnComp = new JButton("Compare");
        jbtnComp.addActionListener(this);

        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");

        jlabResult = new JLabel("");

        jcbx = new JCheckBox("Show position of diff");
        jlabPos = new JLabel("");


        //Add components
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jcbx);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        jfrm.add(jlabPos);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int i = 0, j = 0;

        if (jtfFirst.getText().equals("")) {
            jlabFirst.setText("First file name missing");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabSecond.setText("Second file name missing");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            int c = 1;
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) {
                    if (jcbx.isSelected())
                        jlabPos.setText(Integer.toString(c));
                    break;
                }
                c++;
            } while (i != -1 && j != -1);

            if (i != j)
                jlabResult.setText("Files are not same");
            else
                jlabResult.setText("Files compare equal");

        } catch (IOException exc) {
            jlabResult.setText("File error");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingFC::new);
    }
}
