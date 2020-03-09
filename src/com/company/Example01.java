package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.GeneralPath;

public class Example01 extends Frame {

    public Example01() {
        super("Java 2D Example");
        setSize(600, 600);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                dispose();
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.decode("#a4c639"));

        //the body
        g.fillRect(200, 200, 120, 120);
        //the head
        g.fillArc(200, 150, 120, 80, 0, 180);

        //the two lines above the head
        g.drawLine(240, 165, 220,120);
        g.drawLine(270, 165, 290, 120);

        //legs
        g.fillRoundRect(210, 310, 30, 60, 20, 20);
        g.fillRoundRect(280, 310, 30, 60, 20, 20);

        //hands
        g.fillRoundRect(160, 200, 30, 70, 20, 20);
        g.fillRoundRect(330, 200, 30, 80, 20, 20);

        //eyes
        g.setColor(Color.white);
        g.fillOval(225, 165, 10, 10);
        g.fillOval(275, 165, 10, 10);


        //text
        g.setColor(Color.black);
        g.setFont(new Font("Calibri", Font.BOLD, 30));
        g.drawString("ANDROID", 210, 400);
    }
}
