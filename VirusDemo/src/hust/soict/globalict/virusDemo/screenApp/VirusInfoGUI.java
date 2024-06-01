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
		setSize(600, 600);
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
		LipidVirus.addActionListener(e -> showVirusSelection(true));
	
		NonLipidVirus = new JButton("Non-Lipid-Enveloped Virus");
		NonLipidVirus.setPreferredSize(btnDimension);
		NonLipidVirus.addActionListener(e -> showVirusSelection(false));
		
		Quiz = new JButton("Quiz");
		Quiz.setPreferredSize(btnDimension);
		Quiz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new QuizApp();
			}
			
		});
		
		exitButton = new JButton("Exit");
		
		center.add(LipidVirus);
		center.add(NonLipidVirus);
		center.add(Quiz);
		
		return center;
	}

	private void showVirusSelection(boolean isLipidEnveloped) {
        getContentPane().removeAll();
        add(createMenuBar(), BorderLayout.NORTH);
        JPanel virusPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(isLipidEnveloped ? "Lipid-Enveloped Viruses" : "Non-Lipid-Enveloped Viruses", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        virusPanel.add(titleLabel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        JButton virus1Button = new JButton(isLipidEnveloped ? "HIV" : "Rotavirus");
        JButton virus2Button = new JButton(isLipidEnveloped ? "COVID-19" : "Norovirus");
        JButton backButton = new JButton("Back");

        virus1Button.addActionListener(e -> showVirusDetails(isLipidEnveloped, true));
        virus2Button.addActionListener(e -> showVirusDetails(isLipidEnveloped, false));
        backButton.addActionListener(e -> showMainMenu());

        buttonPanel.add(virus1Button);
        buttonPanel.add(virus2Button);
        buttonPanel.add(backButton);

        virusPanel.add(buttonPanel, BorderLayout.CENTER);
        add(virusPanel);

        revalidate();
        repaint();
    }
	
	private void showVirusDetails(boolean isLipidEnveloped, boolean isFirstVirus) {
        getContentPane().removeAll();
        JPanel detailsPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(isFirstVirus ? (isLipidEnveloped ? "HIV Structure" : "Rotavirus Structure") : (isLipidEnveloped ? "COVID-19 Structure" : "Norovirus Structure"), JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        detailsPanel.add(titleLabel, BorderLayout.NORTH);
        
        JTextArea detailsText = new JTextArea();
        detailsText.setEditable(true);
        detailsText.setFont(new Font("Arial", Font.PLAIN, 16));

        if (isLipidEnveloped) {
            if (isFirstVirus) {
            	HIVStructureGUI hiv = new HIVStructureGUI();
            	hiv.setVisible(true);
            } else {
            	Covid19StructureGUI covid19 = new Covid19StructureGUI();
            	covid19.setVisible(true);
            }
        } else {
            if (isFirstVirus) {
                detailsText.setText("Rotavirus is a non-lipid-enveloped virus. \n It has a triple-layered protein coat and an RNA genome.");
            } else {
            }
        }

        detailsPanel.add(detailsText, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton infectButton = new JButton("Show Infection Process");
        JButton backButton = new JButton("Back");

        infectButton.addActionListener(e -> showInfectionProcess(isLipidEnveloped, isFirstVirus));
        backButton.addActionListener(e -> showVirusSelection(isLipidEnveloped));

        buttonPanel.add(infectButton);
        buttonPanel.add(backButton);

        detailsPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(detailsPanel);

        revalidate();
        repaint();
    }
	
	private void showInfectionProcess(boolean isLipidEnveloped, boolean isFirstVirus) {
        getContentPane().removeAll();
        JPanel infectionPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Infection Process", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        infectionPanel.add(titleLabel, BorderLayout.NORTH);

        JTextArea infectionText = new JTextArea();
        infectionText.setEditable(false);
        infectionText.setFont(new Font("Arial", Font.PLAIN, 16));

        if (isLipidEnveloped) {
            infectionText.setText(isFirstVirus ? "HIV infection ..."
                    : "COVID-19 infection ...");
        } else {
            infectionText.setText(isFirstVirus ? "Rotavirus infection ..."
                    : "Norovirus infection ...");
        }

        infectionPanel.add(infectionText, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton backButton = new JButton("Back");

        backButton.addActionListener(e -> showVirusDetails(isLipidEnveloped, isFirstVirus));

        buttonPanel.add(backButton);

        infectionPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(infectionPanel);

        revalidate();
        repaint();
    }

	
	public static void main(String[] args) {
		VirusInfoGUI screen = new VirusInfoGUI();
		screen.setVisible(true);
	}
}
