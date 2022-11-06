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
        return finalPanel;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.drawRect(0, 0, 500, 300);
        g.drawLine(10, 0, 80, 90);
        System.out.println("HEYY WITC");
        System.out.println("Bar Plot paint Method");
    }

    private void drawPoints() {
        panel = new BarPlot(s);
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.BLACK);
    }
}
