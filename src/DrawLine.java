
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Collections;
import java.awt.Color;
import javax.swing.*;

public class DrawLine extends JPanel {
	
	static int[] xpoints = new int[50];
	static int[] ypoints = new int[50];
	
	@Override
	public void paintComponent (Graphics g)
	{ 
	     super.paintComponent(g);
	     setForeground(Color.black);
	     setForeground(Color.blue);
	     //g.drawLine(xpoints[0], ypoints[0],xpoints[1], ypoints[1]);

	     for(int i = 0;i <49 ;i++)
	     {
		     g.drawLine(xpoints[i], ypoints[i],xpoints[i+1], ypoints[i+1]);
	    	 g.drawRect(xpoints[i], ypoints[i], 10, 2000);
	    	 g.fillRect(xpoints[i], ypoints[i], 10, 2000);
		     
	     }	     
	}
	
    public static void main(String[ ] args)
    {
		for(int i=0; i<50;i++)
		{
			xpoints[i] = (int) (Math.random() * 2000) + 1;
			ypoints[i] = (int) (Math.random() * 2000) + 1;

		}
		Arrays.sort(xpoints);
		//Arrays.sort(ypoints);
		for(int i =0; i<46;i++)
			{
			System.out.print(xpoints[i] + " ");
			System.out.println(ypoints[i]);
			}
    	DrawLine d = new DrawLine( ); 
        JFrame f = new JFrame("Title of the frame");
        f.add(d); //adds DisplayGraphics to the frame for viewing
        f.setSize(500,500); //sets the coordinate size of frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes frame
        f.setLocationRelativeTo(null); //centers the frame on screen          
        f.setVisible(true); //makes frame appear on screen
   }

}
