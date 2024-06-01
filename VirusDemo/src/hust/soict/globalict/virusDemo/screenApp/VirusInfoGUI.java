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
	
	JButton LipidVirus, NonLipidVirus, Quiz, exitButton; 
	JMenuItem Help, Back;
	JPanel center;
	Dimension btnDimension = new Dimension(250, 30);
	
	public VirusInfoGUI() {
		setTitle("Virus Investigation Application");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		showMainMenu();
	}
	
	void showMainMenu() {
		getContentPane().removeAll();
		add(createNorth(), BorderLayout.NORTH);
		add(createCenter(), BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		return north;
	}
	
	JMenuBar createMenuBar() {
		// TODO Auto-generated method stub
		JMenu menu = new JMenu("Options");
		
		Help = new JMenuItem("Help");
		Back = new JMenuItem("Back to main");
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
		
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMainMenu();
			}
		});
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createCenter() {
		//getContentPane().removeAll();
		center = new JPanel();
		center.setSize(5, 5);
		center.setLayout(new FlowLayout());
		
		LipidVirus = new JButton("Lipid-Enveloped Virus");
		LipidVirus.setPreferredSize(btnDimension);
		LipidVirus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().remove(center);
				center = new LipidVirusPanel();
				getContentPane().add(center, BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
	
		NonLipidVirus = new JButton("Non-Lipid-Enveloped Virus");
		NonLipidVirus.setPreferredSize(btnDimension);
		NonLipidVirus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().remove(center);
				center = new NonLipidVirusPanel();
				getContentPane().add(center, BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		
		Quiz = new JButton("Quiz");
		Quiz.setPreferredSize(btnDimension);
		Quiz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new QuizApp();
			}
			
		});
		
		exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the application?", "Exit Confirmation",
                JOptionPane.YES_NO_OPTION);
				
				if(confirm == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
			
		});
		
		center.add(LipidVirus);
		center.add(NonLipidVirus);
		center.add(Quiz);
		center.add(exitButton);
		
		return center;
	}

	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            VirusInfoGUI app = new VirusInfoGUI();
            app.setVisible(true);
        });
	}
}
