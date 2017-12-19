package chapter_15;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TrackM extends Applet implements
    MouseListener, MouseMotionListener{

    int curX = 0, curY = 0;
    int oldX = 0, oldY = 0;
    boolean drow;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        drow = false;
    }

    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}
    public void mouseClicked(MouseEvent me) {}


    public void mousePressed(MouseEvent me) {
        oldX = me.getX();
        oldY = me.getY();
        drow = true;
    }

    public void mouseReleased(MouseEvent me) {
        drow = false;
    }

    public void mouseDragged(MouseEvent me) {
        curX = me.getX();
        curY = me.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        showStatus("Перемещение мыши: " +
        me.getX() + ", " + me.getY());
    }

    public void paint(Graphics g) {
        if (drow)
            g.drawLine(oldX, oldY, curX, curY);
    }
}
