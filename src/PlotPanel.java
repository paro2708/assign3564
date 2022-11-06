
import javax.swing.JPanel;
import java.awt.FlowLayout;
// import java.awt.Color;
import javax.swing.*;

public class PlotPanel extends JPanel implements Observer {
    protected int points[];
    JButton runButton = new JButton();
    static protected PlotPanel p;
    JPanel jPanel;

    private PlotPanel() {

    }

    public static PlotPanel getPlotPanel() {
        if (p == null) {
            p = new PlotPanel();
        }
        return p;
    }

    @Override
    public void update(int points[]) {
        this.points = points;
        drawPanels();
    }

    public JPanel drawPanels() {
        jPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 10));
        jPanel.setSize(470, 1000);
        // Drawable plot = new BarPlot(new BarPlot(new BarPlot(new BarPlot(new
        // BasePlot()))));
        Drawable plot = new BarPlot(new BarPlot(new BasePlot()));
        jPanel = plot.plotPoints(jPanel, points);
        return jPanel;
    }

}
