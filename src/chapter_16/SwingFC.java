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

    SwingFC() {
        JFrame jfrm = new JFrame("Compare files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200,190);
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

        //Add components
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }
}
