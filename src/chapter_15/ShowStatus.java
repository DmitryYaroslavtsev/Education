package chapter_15;

import java.applet.*;
import java.awt.*;

/*
    <applet code="ShowStatus" width=300 height=50>
    </applet>
 */

public class ShowStatus extends Applet {
    public void paint(Graphics g) {
        g.drawString("This is in the applet window.", 10, 20);
        showStatus("This is shown in the status window.");
    }
}
