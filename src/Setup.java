import javax.swing.JFrame;


public class Setup {
	static JFrame frame = new JFrame();
	static DrawingPanel panel = new DrawingPanel(frame);
	
	public static void main(String[] args)
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		frame.addKeyListener(panel);
		frame.setVisible(true);
		frame.getContentPane().add(panel);
		frame.repaint();
	}
}
