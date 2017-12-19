package chapter_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo implements ActionListener {

    JLabel jlab;

    ButtonDemo() {

        JFrame jfrm = new JFrame("Button example");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(220, 90);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        jlab = new JLabel("Press a button");

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed Up");
        else
            jlab.setText("You pressed Down");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonDemo::new);
    }
}
