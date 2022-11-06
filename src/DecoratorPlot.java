import javax.swing.JPanel;

public class DecoratorPlot extends JPanel implements Drawable {
    Drawable simplePlot;
    int[] points;

    public DecoratorPlot(Drawable s) {
        simplePlot = s;
    }

    @Override
    public JPanel plotPoints(JPanel j, int points[]) {
        return simplePlot.plotPoints(j, points);
    }
}
