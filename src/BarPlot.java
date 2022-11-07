import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class BarPlot extends DecoratorPlot {
    JPanel panel;
    Drawable s;

    public BarPlot(Drawable s) {
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
        int height = 500;
        super.paint(g);
        g.setColor(Color.YELLOW);
        int points[] = DataSource.getDataSource().getData();
        int avg = Evaluator.getEvaluator().findAvg();
        g.drawLine(0, height - avg, height, height - avg);
        int prevX = 0;
        for (int i = 0; i < points.length - 1; ++i) {
            g.drawLine(prevX, height - points[i], prevX + 20, height - points[i + 1]);
            g.fillRect(prevX, height - points[i] - 2, 5, height);
            prevX = prevX + 20;
        }
    }

    private void drawPoints() {
        panel = new BarPlot(s);
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setBackground(Color.BLACK);
    }
}
