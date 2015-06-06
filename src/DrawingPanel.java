import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawingPanel extends JPanel implements KeyListener{

	int playerX = 0, playerY = 0, playerZ = 0, r = 0, FOV = 90;
	double alpha = 0;
	public Point3D[] points = {new Point3D(1, 0, 1), new Point3D(1, 0, 2), new Point3D(-1, 0, 1), 
		new Point3D(-1, 0, 2), new Point3D(1, 1, 1), new Point3D(1, 1, 2), new Point3D(-1, 1, 1), new Point3D(-1, 1, 2)};
	JFrame frame;
	
	public DrawingPanel(JFrame f)
	{
		super();
		this.frame = f;
		
	}
	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 550, 450);
		for(int i = 0; i < points.length; ++i)
		{
			double x = Math.cos(alpha) * points[i].getX() + Math.sin(alpha) * points[i].getZ();
			double y = points[i].getY();
			double z = -Math.sin(alpha) * points[i].getX() + Math.cos(alpha) * points[i].getZ();
//			double x = points[i].getX();
//			double y = points[i].getY();
//			double z = points[i].getZ();
			int relativeZ = (int) Math.round(Math.abs(z - playerZ));
			int x1 = (int) Math.round(250 + (x/relativeZ)*250);
			int y1 = (int) Math.round(300 - (y/relativeZ)*200);
			g.setColor(Color.GREEN);
			g.fillOval(x1,  y1,  5,  5);
			g.drawString(i + "", x1 + 10, y1);
			g.setColor(Color.BLACK);
			g.drawString(alpha + "", 550, 60);
			System.out.println(x1 + ", " + y1);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == 'e')
		{
			alpha += 0.1;
			frame.repaint();
		}
		else if(e.getKeyChar() == 'q')
		{
			alpha -= 0.1;
			frame.repaint();
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
