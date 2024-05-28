package hust.soict.globalict.virusDemo.screenApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class VirusInfoGUI extends JFrame {
	
	JButton LipidVirus, NonLipidVirus, Quiz; 
	JMenuItem Help, Back;
	JPanel center;
	
	public VirusInfoGUI() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		setTitle("Virus Investigation Application");
		setSize(1200, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		add(createNorth(), BorderLayout.NORTH);
		add(createCenter(), BorderLayout.CENTER);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JPanel createHeader() {
		// TODO Auto-generated method stub
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("Virus Investigation Program");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.BLACK);
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JMenuBar createMenuBar() {
		// TODO Auto-generated method stub
		JMenu menu = new JMenu("Options");
		
		Help = new JMenuItem("Help");
		Back = new JMenuItem("Back");
		menu.add(Help);
		menu.add(Back);
		
		Help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Help, "This application helps users learn about different viruses.\n\n" +
                        "Select a type of virus to see its structure and understand the infection process.\n\n" +
                		"Select the Quiz option do participate in a fun quiz about viruses\n\n"+
                        "Use the 'Back' button to return to the previous menu.",
                "Help", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createCenter() {
		//getContentPane().removeAll();
		center = new JPanel();
		center.setLayout(new FlowLayout());
		
		LipidVirus = new JButton("Lipid-Enveloped Virus");
		NonLipidVirus = new JButton("Non-Lipid-Enveloped Virus");
		Quiz = new JButton("Quiz");
		
		Quiz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new QuizApp();
			}
			
		});
		center.add(LipidVirus);
		center.add(NonLipidVirus);
		center.add(Quiz);
		
		return center;
	}

	
	public static void main(String[] args) {
		VirusInfoGUI screen = new VirusInfoGUI();
		screen.setVisible(true);
	}
}
