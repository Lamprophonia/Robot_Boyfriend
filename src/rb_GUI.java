import javax.swing.*;
import java.awt.*;

public class rb_GUI
{
	//	GUI variable declarations
	private JFrame f;
	private JPanel p;
	
	public rb_GUI()
	{
		gui();
	}
	
	public void gui()
	{
		//	Frame creation
		f = new JFrame("Robot Boyfriend");
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//	Panel creation
		p = new JPanel();
		p.setBackground(Color.WHITE);
		
		//	Adds panel to the frame
		f.add(p, BorderLayout.CENTER);
		
	}
}
