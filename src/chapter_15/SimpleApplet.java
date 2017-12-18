package chapter_15;

import java.applet.*;
import java.awt.*;

/*
    <applet code="SimpleApplet" width=200 height=60>
    </applet>
 */

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Java makes applets easy.", 20, 20);
    }
}
