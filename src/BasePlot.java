import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BasePlot extends JPanel implements Drawable {

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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = panel.getWidth();
        int height = panel.getHeight();
        panel.setForeground(Color.GREEN);
        panel.setBackground(Color.BLACK);
        g.setColor(Color.YELLOW);
        panel.setSize(450, 600);
        g.drawOval(0, 0, 500, 300);
    }

    private void drawPoints() {
        System.out.println("IM here");
        panel = new BasePlot();

    }
}
