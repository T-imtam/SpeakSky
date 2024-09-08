import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class GoalWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1;
	
	JFrame goalWindow = new JFrame();
	JButton goal1 = new JButton();
	JButton goal2 = new JButton();
	JButton goal3 = new JButton ();
	JLabel titleLabel = new JLabel ("Daily Goal");
	JButton exitButton = new JButton();
	
	JTextArea msg = new JTextArea ();
	
	public GoalWindow() {
		
		ImageIcon icon = new ImageIcon("Speak Sky Icon.png");
		goalWindow.setIconImage(icon.getImage());
		
		goalWindow.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		goalWindow.setSize(540, 960); // setting the dimension (x,y) of the menu
		goalWindow.setTitle("Speak Sky"); // set the title of the menu
		goalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allow user to exit the window by pressing the exit button
		goalWindow.setResizable(false); // prevent user from resizing the menu
		//CHANGE ICON LATER ImageIcon icon = newImageIcon("filename");
		//menu.setIconImage(Image.getImage()); to change the menu icon
		goalWindow.getContentPane().setBackground(new Color(39,43,87)); // change background colour
		
		titleLabel.setFont(new Font (null, Font.BOLD,50));
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setPreferredSize(new Dimension (300, 100));
		
		goal1.setText("Log in this app");
		goal1.setFont(new Font (null,Font.PLAIN,25));
		goal1.setFocusable(false);
		goal1.setBackground(new Color(39,43,87));
		goal1.setForeground(Color.WHITE);
		goal1.setPreferredSize(new Dimension (415,150));
		goal1.addActionListener(this);
		
		goal2.setText("Write a journal");
		goal2.setFont(new Font (null,Font.PLAIN,25));
		goal2.setFocusable(false);
		goal2.setBackground(new Color(39,43,87));
		goal2.setForeground(Color.WHITE);
		goal2.setPreferredSize(new Dimension (415,150));
		goal2.addActionListener(this);
		
		goal3.setText("Exercise");
		goal3.setFont(new Font (null,Font.PLAIN,25));
		goal3.setFocusable(false);
		goal3.setBackground(new Color(39,43,87));
		goal3.setForeground(Color.WHITE);
		goal3.setPreferredSize(new Dimension (415,150));
		goal3.addActionListener(this);
		
		exitButton.setText("Exit");
		exitButton.setFont(new Font (null,Font.PLAIN,15));
		exitButton.setFocusable(false);
		exitButton.setBackground(new Color(39,43,87));
		exitButton.setForeground(Color.WHITE);
		exitButton.setPreferredSize(new Dimension (100,50));
		exitButton.addActionListener(this);
		
		msg.setFont(new Font (null,Font.PLAIN,20));
		msg.setForeground(Color.WHITE);
		msg.setBackground(new Color(39,43,87));
		msg.setPreferredSize(new Dimension (405,150));
		msg.setLineWrap(true);
		msg.setFocusable(false);
		
		goalWindow.add(titleLabel);
		goalWindow.add(exitButton);
		goalWindow.add(goal1);
		goalWindow.add(goal2);
		goalWindow.add(goal3);
		goalWindow.add(msg);
		goalWindow.setVisible(true); // make the menu visible
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==goal1) {
			String txt = goal1.getText();
			if (txt.equalsIgnoreCase("Log in this app")) {
				msg.setText("You are ready to start your day!");
				goal1.setText("Talk to a friend");
			}
			else if (txt.equalsIgnoreCase("Talk to a friend")) {
				msg.setText("You talk to a friend! That's a win!");
				goal1.setText("Log in this app");
			}
			
		}
		else if (e.getSource()==goal2) {
			String txt = goal2.getText();
			if (txt.equalsIgnoreCase("Write a journal")) {
				msg.setText("Journaling can help you to reflect on your day, keep writing :D");
				goal2.setText("Attend social events");
			}
			else if (txt.equalsIgnoreCase("Attend social events")) {
				msg.setText("Wow that's a big step! Great work!");
				goal2.setText("Write a journal");
			}
		}
		else if (e.getSource()==goal3) {
			String txt = goal3.getText();
			if (txt.equalsIgnoreCase("Exercise")) {
				msg.setText("Keeping your body healthy is also important!");
				goal3.setText("Try something new");
			}
			else if (txt.equalsIgnoreCase("Try something new")) {
				msg.setText("You got this!");
				goal3.setText("Exercise");
			}
		}
		
		else if (e.getSource()==exitButton) {
			goalWindow.dispose();
			new Frame();
		}
		
	}


}
