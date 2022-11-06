// Java program to draw a line in Applet

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;

class MyCanvas extends JComponent{

  public void paint(Graphics g) {
    // draw and display the line
    g.drawLine(30, 20, 80, 90);
  }
}

public class Test {
  public static void main2(String[] a) {

    // creating object of JFrame(Window popup)
    JFrame window = new JFrame();

    // setting closing operation
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // setting size of the pop window
    window.setBounds(30, 30, 200, 200);

    // setting canvas for draw
    window.getContentPane().add(new MyCanvas());

    // set visibility
    window.setVisible(true);
  }
}
