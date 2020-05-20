
package com.draw.java;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class JavaGraphics extends Canvas{
    
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawString("DOTA", 70, 300);
    }
    
    public static void main(String[]args){
        
        JFrame myframe = new JFrame("Shapes");
        JavaGraphics JG = new JavaGraphics();
        myframe.setSize(400, 200);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.add(JG);
    }
}
