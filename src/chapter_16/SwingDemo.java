package chapter_16;

import javax.swing.*;

class SwingDemo {

    SwingDemo() {
        JFrame jfrm = new JFrame("Application");

        jfrm.setSize(275,100);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Label");

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
