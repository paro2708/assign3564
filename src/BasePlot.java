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
    public JPanel plotPoints(JPanel finalPanel, int point[]) {
        System.out.println("Base Plot");
        this.points = point;
        drawPoints();
        finalPanel.add(panel);
        return finalPanel;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.YELLOW);
        int points[] = DataSource.getDataSource().getData();
        int prevX = 0;
        for (int i = 0; i < points.length - 1; ++i) {
            g.drawLine(prevX, points[i], prevX + 20, points[i + 1]);
            prevX = prevX + 20;
        }
    }

    private void drawPoints() {
        System.out.println("IM here in base class");
        panel = new BasePlot();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setBackground(Color.RED);
    }
}
