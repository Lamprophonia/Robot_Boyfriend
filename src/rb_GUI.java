import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

//	Inherits everything from JFrame
public class rb_GUI extends JFrame
{
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	//	Same as a text field, only the text will be displayed as asteriks (*)
	private JPasswordField pwf1;
	
	public rb_GUI()
	{
		//	Title
		super("Robot Boyfriend");
		//	Layout (default)
		setLayout(new FlowLayout());
		
		//	Initializes a text field, parameter = length of the text field
		tf1 = new JTextField(10);
		add(tf1);
		//	Initializes a text field with default text
		tf2 = new JTextField("Enter text here");
		add(tf2);
		//	initializes a text field with default text and a length of 20
		tf3 = new JTextField("uneditable", 20);
		//	Makes the text field not editable
		tf3.setEditable(false);
		add(tf3);
		//	Initializes the password field
		pwf1 = new JPasswordField("mypass");
		add(pwf1);
		
		//	Calling the handler class (built within this class
		theHandler handler = new theHandler();
		tf1.addActionListener(handler);
		tf2.addActionListener(handler);
		tf3.addActionListener(handler);
		pwf1.addActionListener(handler);
	}
	
	private class theHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String string = "";
			
			if(event.getSource() == tf1)
			{
				//	getActionCommand = the text that was entered
				string = String.format("Field 1: %s", event.getActionCommand());
			}else if(event.getSource() == tf2)
			{
				string = String.format("Field 2: %s", event.getActionCommand());
			}else if(event.getSource() == tf3)
			{
				string = String.format("Field 3: %s", event.getActionCommand());
			}else if(event.getSource() == pwf1)
			{
				string = String.format("Password field: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
