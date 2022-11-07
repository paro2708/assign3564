
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class PointPlot extends DecoratorPlot {
    JPanel panel;
    Drawable s;

    public PointPlot(Drawable s) {
        super(s);
        this.s = s;
    }

    @Override
    public JPanel plotPoints(JPanel finalPanel, int[] points) {
        finalPanel = super.plotPoints(finalPanel, points);
        drawPoints();
        finalPanel.add(panel);
        for (int x : points) {
            System.out.println(x);
        }
        System.out.println("points in bar");
        return finalPanel;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.YELLOW);
        int points[] = DataSource.getDataSource().getData();
        int height = 700;
        int prevX = 0;
        int avg = Evaluator.getEvaluator().findAvg();
        g.drawLine(0, 700 - avg, 700, 700 - avg);
        for (int i = 0; i < points.length - 1; ++i) {
            g.drawLine(prevX, height - points[i], prevX + 20, height - points[i + 1]);
            g.fillRect(prevX, height - points[i] - 2, 5, 5);
            prevX = prevX + 20;
        }
    }

    private void drawPoints() {
        panel = new PointPlot(s);
        panel.setPreferredSize(new Dimension(500, 700));
        panel.setBackground(Color.BLACK);
    }
}
