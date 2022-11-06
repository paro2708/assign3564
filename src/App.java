import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    static DataSource dataSource = DataSource.getDataSource();

    public App() {
        PlotPanel plotPanel = PlotPanel.getPlotPanel();
        JFrame frame = new JFrame();
        JButton runButton = new JButton("Run");
        dataSource.setObs1(plotPanel);
        dataSource.setData();
        frame.setSize(500, 1100);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        frame.add(plotPanel.drawPanels());
        runButton.addActionListener(this);
        frame.add(runButton);
        frame.setTitle("Assignment 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Run Button Clicked");
        dataSource.setData();
        dataSource.setData();
    }

}
