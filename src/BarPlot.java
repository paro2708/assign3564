import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class BarPlot extends DecoratorPlot {
    JPanel panel;

    public BarPlot(Drawable s) {
        super(s);
    }

    @Override
    public JPanel plotPoints(JPanel finalPanel, int[] points) {
        finalPanel = super.plotPoints(finalPanel, points);
        drawPoints();
        finalPanel.add(panel);
        return finalPanel;
    }

    private void drawPoints() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));

        panel.setBackground(Color.GRAY);
    }
}
