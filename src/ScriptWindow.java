import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ScriptWindow extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1;
	
	JFrame scriptWindow = new JFrame();
	
	JTextArea txt;
	String fileName;
	
	JLabel titleLabel;
	
	JTextArea textArea1;
	JTextArea textArea2;
	JTextArea textArea3;
	JTextArea textArea4;
	
	JButton saveButton;
	JButton exitButton;
	JButton newFileButton1;
	JButton newFileButton2;
	JButton newFileButton3;
	JButton newFileButton4;
	
	int textAreaWidth = 450;
	int textAreaHeight = 300;

	public ScriptWindow() {
		
		ImageIcon icon = new ImageIcon("Speak Sky Icon.png");
		scriptWindow.setIconImage(icon.getImage());
		
		scriptWindow.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
		scriptWindow.setSize(540, 960); // setting the dimension (x,y) of the menu
		scriptWindow.setTitle("Speak Sky"); // set the title of the menu
		scriptWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allow user to exit the window by pressing the exit button
		scriptWindow.setResizable(false); // prevent user from resizing the menu
		//CHANGE ICON LATER ImageIcon icon = newImageIcon("filename");
		//menu.setIconImage(Image.getImage()); to change the menu icon
		scriptWindow.getContentPane().setBackground(new Color(39,43,87)); // change background colour
		
		titleLabel = new JLabel ("Write a script for...");
		titleLabel.setFont(new Font (null, Font.BOLD,33));
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setPreferredSize(new Dimension (300, 100));
		
		newFileButton1 = new JButton ("Order Food");
		newFileButton1.setBackground(new Color(39,43,87));
		newFileButton1.setForeground(Color.WHITE);
		newFileButton1.addActionListener(this);
		newFileButton1.setFocusable(false);
		newFileButton1.setPreferredSize(new Dimension (175,100));
		
		newFileButton2 = new JButton ("Doctor's Appointment");
		newFileButton2.setBackground(new Color(39,43,87));
		newFileButton2.setForeground(Color.WHITE);
		newFileButton2.addActionListener(this);
		newFileButton2.setFocusable(false);
		newFileButton2.setPreferredSize(new Dimension (175,100));
		
		newFileButton3 = new JButton ("Presentation");
		newFileButton3.setBackground(new Color(39,43,87));
		newFileButton3.setForeground(Color.WHITE);
		newFileButton3.addActionListener(this);
		newFileButton3.setFocusable(false);
		newFileButton3.setPreferredSize(new Dimension (175,100));

		newFileButton4 = new JButton ("Other");
		newFileButton4.setBackground(new Color(39,43,87));
		newFileButton4.setForeground(Color.WHITE);
		newFileButton4.addActionListener(this);
		newFileButton4.setFocusable(false);
		newFileButton4.setPreferredSize(new Dimension (175,100));

		saveButton = new JButton ("Save");
		saveButton.setBackground(new Color(39,43,87));
		saveButton.setForeground(Color.WHITE);
		saveButton.addActionListener(this);
		saveButton.setFocusable(false);
		saveButton.setPreferredSize(new Dimension (175,100));
		
		exitButton = new JButton ("Exit");
		exitButton.setBackground(new Color(39,43,87));
		exitButton.setForeground(Color.WHITE);
		exitButton.addActionListener(this);
		exitButton.setFocusable(false);
		exitButton.setPreferredSize(new Dimension (175,100));
		
		scriptWindow.add(titleLabel);
		scriptWindow.add(newFileButton1);
		scriptWindow.add(newFileButton2);
		scriptWindow.add(newFileButton3);
		scriptWindow.add(newFileButton4);
		scriptWindow.add(saveButton);
		scriptWindow.add(exitButton);
		scriptWindow.setVisible(true); // make the menu visible
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==newFileButton1) {
			textArea1 = new JTextArea();
			textArea1.setLineWrap(true);
			textArea1.setPreferredSize(new Dimension(textAreaWidth,textAreaHeight));
			scriptWindow.add(textArea1);
			scriptWindow.setVisible(true);
			txt = textArea1;
			fileName = "script1.txt";
			fileReader(fileName, txt);
			newFileButton1.setEnabled(false);
			newFileButton2.setEnabled(false);
			newFileButton3.setEnabled(false);
			newFileButton4.setEnabled(false);
		}
		
		else if (e.getSource()==newFileButton2) {
			textArea2 = new JTextArea();
			textArea2.setLineWrap(true);
			textArea2.setPreferredSize(new Dimension(textAreaWidth,textAreaHeight));
			scriptWindow.add(textArea2);
			scriptWindow.setVisible(true);
			txt = textArea2;
			fileName = "script2.txt";
			fileReader(fileName, txt);
			newFileButton1.setEnabled(false);
			newFileButton2.setEnabled(false);
			newFileButton3.setEnabled(false);
			newFileButton4.setEnabled(false);
		}
		
		else if (e.getSource()==newFileButton3) {
			textArea3 = new JTextArea();
			textArea3.setLineWrap(true);
			textArea3.setPreferredSize(new Dimension(textAreaWidth,textAreaHeight));
			scriptWindow.add(textArea3);
			scriptWindow.setVisible(true);
			txt = textArea3;
			fileName = "script3.txt";
			fileReader(fileName, txt);
			newFileButton1.setEnabled(false);
			newFileButton2.setEnabled(false);
			newFileButton3.setEnabled(false);
			newFileButton4.setEnabled(false);
		}
		
		else if (e.getSource()==newFileButton4) {
			textArea4 = new JTextArea();
			textArea4.setLineWrap(true);
			textArea4.setPreferredSize(new Dimension(textAreaWidth,textAreaHeight));
			scriptWindow.add(textArea4);
			scriptWindow.setVisible(true);
			txt = textArea4;
			fileName = "script4.txt";
			fileReader(fileName, txt);
			newFileButton1.setEnabled(false);
			newFileButton2.setEnabled(false);
			newFileButton3.setEnabled(false);
			newFileButton4.setEnabled(false);
		}
		
		if (e.getSource()==saveButton) {
			txt.setEditable(false);
			txt.setVisible(false);
			newFileButton1.setEnabled(true);
			newFileButton2.setEnabled(true);
			newFileButton3.setEnabled(true);
			newFileButton4.setEnabled(true);
			fileWriter(fileName, txt);
		}
		
		if (e.getSource()==exitButton) {
			scriptWindow.dispose();
			new Frame();
		}
	}
	
	public void fileWriter (String fileName, JTextArea textArea) {
		try {
			BufferedWriter writer = new BufferedWriter (new FileWriter(fileName));
			
			writer.write(textArea.getText());
			
			writer.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileReader (String fileName, JTextArea textArea) {
		try {
			BufferedReader reader = new BufferedReader (new FileReader(fileName));
			
			String line = reader.readLine();
			textArea.setText(line);
			
			reader.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
