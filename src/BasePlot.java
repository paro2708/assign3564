import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class BasePlot extends JPanel implements Drawable {

    JPanel panel;
    int points[];

    public BasePlot() {

    }

    @Override
    public JPanel plotPoints(JPanel finalPanel, int points[]) {
        System.out.println("Base Plot");
        for (int x : points)
            System.out.println(x);
        drawPoints();
        finalPanel.add(panel);
        return finalPanel;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // panel.setSize(660, 600);
        // panel.setForeground(Color.GREEN);
        // panel.setBackground(Color.BLACK);
        g.setColor(Color.YELLOW);
        g.drawRect(0, 0, 500, 300);
        g.drawLine(10, 0, 80, 90);
    }

    private void drawPoints() {
        System.out.println("IM here in base class");
        panel = new BasePlot();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.RED);
    }
}
