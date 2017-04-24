package com.bot;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nikitinmd.18 on 24.04.2017.
 */
public class Line extends JPanel {
    public Point a;
    public Point b;
    Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(a.getX(),a.getY() ,b.getX() ,b.getY() );
    }
}


