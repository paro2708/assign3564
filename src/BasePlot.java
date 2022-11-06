import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class BasePlot implements Drawable {

    JPanel panel;
    int points[];

    public BasePlot() {

    }

    @Override
    public JPanel plotPoints(JPanel finalPanel, int points[]) {
        System.out.println("Base Plot");
        drawPoints();
        finalPanel.add(panel);
        return finalPanel;
    }

    private void drawPoints() {

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(450, 300));
        panel.setBackground(Color.BLACK);
    }
}
