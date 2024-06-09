package hust.soict.globalict.virusDemo.screenApp;

import javax.swing.*;

import hust.soict.globalict.virusDemo.GUIComponents.QuizApp;
import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;
import hust.soict.globalict.virusDemo.viruses.CovidVirus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class VirusInfoGUI extends JFrame {
	
	JButton LipidVirus, NonLipidVirus, Quiz, exitButton; 
	JMenuItem Help, Back;
	JPanel center;
	JPanel virusSelectionPanel, LipidVirusPanel, NonLipidVirusPanel, Covid19Panel, HIVPanel, NoroVirusPanel, RotaVirusPanel;
	JPanel Covid19StructurePanel, Covid19InfectionPanel;
	
	public VirusInfoGUI() {
		setTitle("Virus Investigation Application");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		LipidVirusPanel = createLipidVirusPanel();
		NonLipidVirusPanel = createNonLipidVirusPanel();
		Covid19Panel = createCovid19Panel();
		showMainMenu();
	}

	void showMainMenu() {
		getContentPane().removeAll();
		add(createNorth(), BorderLayout.NORTH);
		add(createSouth(), BorderLayout.SOUTH);
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
	
	private void switchPanel(JPanel panel) {
        center.removeAll();
        center.add(panel, BorderLayout.CENTER);
        center.revalidate();
        center.repaint();
    }
	
	JPanel createSouth() {
		//getContentPane().removeAll();
		center = new JPanel();
		center.setSize(5, 5);
		center.setLayout(new FlowLayout());
		
		LipidVirus = new JButton("Lipid-Enveloped Virus");
		LipidVirus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(LipidVirusPanel);
			}
		});
	
		NonLipidVirus = new JButton("Non-Lipid-Enveloped Virus");
		NonLipidVirus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(NonLipidVirusPanel);
			}
		});
		
		Quiz = new JButton("Quiz");
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

	private JPanel createLipidVirusPanel() {
		JButton covidButton;
		JButton HIVButton;
		JPanel mainPanel;
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		covidButton = new JButton("SARS-CoV2");
		covidButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(Covid19Panel);
			}
			
		});
		mainPanel.add(covidButton);
		
		HIVButton = new JButton("HIV");
		HIVButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		});
		mainPanel.add(HIVButton);
		
		return mainPanel;
	}
	
	private JPanel createCovid19Panel() {
		JButton showOrigin;
		JButton showStructure;
		JPanel mainPanel;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		ArrayList<String> capsidProteins = new ArrayList<String>();
		ArrayList<String> functionProteins = new ArrayList<String>();
		Capsid capsid = new Capsid("helical nucleocapsid", capsidProteins, "The envelope and its spike proteins are key for virus attachment and entry into host cells");
		AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "single, positive-sense RNA genome");
		Envelope envelope = new Envelope("The envelope is also derived from the host cell membrane, containing viral proteins like the spike (S), envelope (E), and membrane (M) proteins", functionProteins, "The envelope is relatively fragile, making the virus sensitive to disinfectants, heat, and drying. However, the spike protein's affinity for the ACE2 receptor increases its infectivity");

		
		CovidVirus virus = new CovidVirus("SARS-CoV2", "Betacoronavirus", capsid, acidNu, true, 120, "spherical");
		
		showOrigin  = new JButton("Origin and history");
		showOrigin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(covid19StructurePanel())
			}
			
		});
		
		mainPanel.add(showOrigin, BorderLayout.SOUTH);
		
		showStructure = new JButton("Show Structure");
		showStructure.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(Covid19StructurePanel);
			}
			
		});
		mainPanel.add(showStructure);
		
		return mainPanel;
	}
	
	
	private JPanel createCovid19StructurePanel(CovidVirus virus) {
		JPanel mainPanel;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText(virus.showStructureToString());
		
		return mainPanel;
	}
	
	private JPanel createNonLipidVirusPanel() {
		JButton NoroButton, RotaButton;
		JPanel mainPanel;
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		NoroButton = new JButton("NoroVirus");
		NoroButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
				
		});
		mainPanel.add(NoroButton);
			
		RotaButton = new JButton("RotaVirus");
		RotaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		mainPanel.add(RotaButton);
		
		return mainPanel;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            VirusInfoGUI app = new VirusInfoGUI();
            app.setVisible(true);
        });
	}
}
