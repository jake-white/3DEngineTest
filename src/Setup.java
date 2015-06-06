import javax.swing.JFrame;


public class Setup {
	static Point3D[] points = {new Point3D(1, 0, 1), new Point3D(1, 0, 2), new Point3D(-1, 0, 1), 
		new Point3D(-1, 0, 2), new Point3D(1, 1, 1), new Point3D(1, 1, 2), new Point3D(-1, 1, 1), new Point3D(-1, 1, 2)};
	static JFrame frame = new JFrame();
	static int x = 0, y = 0, z = 0, r = 0, FOV = 90;
	static DrawingPanel panel = new DrawingPanel();
	
	public static void main(String[] args)
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.getContentPane().add(panel);
		frame.repaint();
	}
}
