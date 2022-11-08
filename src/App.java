import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;

/**
 * @author Anantha Kandrapu
 * @author Mohammad Danish Khan
 * @author Paromita Roy
 * 
 * This is the driver code that calls all the functions necessary to plot random points in three
 * different formats. These formats are- a line plot, point plot, and a bar plot.
 * 
 */
public class App extends JFrame implements ActionListener {
    static PlotPanel plotPanel = PlotPanel.getPlotPanel();
    static DataSource dataSource = DataSource.getDataSource();
    static JFrame frame;

    //This code creates a new frame and adds the buttons.
    public JFrame createFrame(String buttonName, String title) {
        frame = new JFrame();
        JButton runButton = new JButton(buttonName);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        runButton.addActionListener(this);
        frame.add(runButton);
        frame.setTitle(title);
        frame.setVisible(true);
        return frame;
    }

    public void frameGenerator() {
        JFrame frame = createFrame("Run", "Assignment 03- Design Patterns");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.add(plotPanel.drawPanels());
        frame.setSize(2000, 2000);
    }

    public App() {
        JFrame frame = createFrame("First Run", "Assignment 03- Design Patterns");
        frame.setSize(200, 200);
    }

    public static void main(String[] args) throws Exception {
        dataSource.setObs1(plotPanel);
        dataSource.setData();
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dataSource.setData();
        frame.dispose();
        frameGenerator();
    }

}
