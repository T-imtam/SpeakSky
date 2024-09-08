import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
	
	static final long serialVersionUID = 1;
	
	JButton option1;
	JButton option2;
	JButton option3;
	
	JLabel titleLabel;
	
	JFrame userMenu = new JFrame();
	
	public Frame() {
		
		titleLabel = new JLabel("Speak Sky");
		titleLabel.setFont(new Font ("Lucida Handwriting", Font.BOLD,50));
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setPreferredSize(new Dimension (300, 100));
		titleLabel.setBounds(110,100,415,200);
		
		option1 = new JButton("Goal Tracking");
		option1.setBounds(50,320,415,200); // x,y,w,h
		option1.setBackground(new Color(39,43,87));
		option1.setForeground(Color.WHITE);
		option1.addActionListener(this);
		option1.setFocusable(false);
	
		option2 = new JButton("Write a Script");
		option2.setBounds(50,560,415,200); // x,y,w,h
		option2.setBackground(new Color(39,43,87));
		option2.setForeground(Color.WHITE);
		option2.addActionListener(this);
		option2.setFocusable(false);
		
		ImageIcon icon = new ImageIcon("Speak Sky Icon.png");
		userMenu.setIconImage(icon.getImage());
		
		userMenu.setLayout(null);
		userMenu.setSize(540, 960); // setting the dimension (x,y) of the menu
		userMenu.setTitle("Speak Sky"); // set the title of the menu
		userMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allow user to exit the window by pressing the exit button
		userMenu.setResizable(false); // prevent user from resizing the menu
		userMenu.getContentPane().setBackground(new Color(39,43,87)); // change background colour
		userMenu.add(titleLabel);
		userMenu.add(option1);
		userMenu.add(option2);
		userMenu.setVisible(true); // make the menu visible
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==option1) {
			userMenu.dispose();
			new GoalWindow();
		}
		else if (e.getSource()==option2) {
			userMenu.dispose();
			new ScriptWindow();
		}
		
	}

}
