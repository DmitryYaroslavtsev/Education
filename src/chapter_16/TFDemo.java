package chapter_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TFDemo implements ActionListener{

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {
        JFrame jfrm = new JFrame("Use a Text Field");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");

        jbtnRev = new JButton("Reverse");

        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Reverse")) {
            String ordStr = jtf.getText();
            String resStr = "";

            for (int i = ordStr.length() -1; i >=0 ; i--) {
                resStr += ordStr.charAt(i);
            }
            jtf.setText(resStr);
        }
        else
            jlabContents.setText("You pressed ENTER. Textis : " +
            jtf.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TFDemo::new);
    }
}
