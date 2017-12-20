package chapter_16;

import javax.swing.*;
import java.awt.*;

public class MySwingApplet extends JApplet {

    private JLabel jlab;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(this::makeGUI);
        } catch (Exception exc) {
            System.out.println("Can't create: " + exc);
        }
    }

    private void makeGUI() {
        setLayout(new FlowLayout());

        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        jbtnUp.addActionListener((ae) ->
                jlab.setText("You pressed Up"));

        jbtnDown.addActionListener((ae) ->
                jlab.setText("You pressed Down"));

        add(jbtnUp);
        add(jbtnDown);

        jlab = new JLabel("Press a button");

        add(jlab);
    }

}
