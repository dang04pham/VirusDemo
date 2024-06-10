package hust.soict.globalict.virusDemo.screenApp;

import javax.swing.*;

import hust.soict.globalict.virusDemo.GUIComponents.Covid19StructureGUI;
import hust.soict.globalict.virusDemo.GUIComponents.HIVStructureGUI;
import hust.soict.globalict.virusDemo.GUIComponents.QuizApp;
import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;
import hust.soict.globalict.virusDemo.viruses.CovidVirus;
import hust.soict.globalict.virusDemo.viruses.HIVVirus;

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
	
	public VirusInfoGUI() {
		setTitle("Virus Investigation Application");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		LipidVirusPanel = createLipidVirusPanel();
		NonLipidVirusPanel = createNonLipidVirusPanel();
		Covid19Panel = createCovid19Panel();
		HIVPanel = createHIVPanel();
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
		JButton back;
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
				switchPanel(HIVPanel);
			}
		
		});
		mainPanel.add(HIVButton);
		
		back = new JButton("Back");
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showMainMenu();
			}
			
		});
		mainPanel.add(back);
		
		return mainPanel;
	}
	
	private JPanel createCovid19Panel() {
		JButton showOrigin;
		JButton showStructure;
		JButton showInfectionProcess;
		JButton back;
		JPanel mainPanel;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		
		ArrayList<String> capsidProteins = new ArrayList<String>();
		ArrayList<String> functionProteins = new ArrayList<String>();
		Capsid capsid = new Capsid("helical nucleocapsid", capsidProteins, "The envelope and its spike proteins are key for virus attachment and entry into host cells");
		AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "single, positive-sense RNA genome");
		Envelope envelope = new Envelope("The envelope is also derived from the host cell membrane, containing viral proteins like the spike (S), envelope (E), and membrane (M) proteins", functionProteins, "The envelope is relatively fragile, making the virus sensitive to disinfectants, heat, and drying. However, the spike protein's affinity for the ACE2 receptor increases its infectivity");
		CovidVirus virus = new CovidVirus("SARS-CoV2", "Betacoronavirus", capsid, acidNu, envelope, true, 120, "spherical");
		capsidProteins.add("spike (S) proteins");
		capsidProteins.add("membrane (M) proteins");
		capsidProteins.add("envelope (E) proteins");
		functionProteins.add("Spike Protein (S): Binds to the ACE2 receptor on host cells");
		functionProteins.add("Envelope Protein (E): Involved in virus assembly and release");
		functionProteins.add("Membrane Protein (M): Helps maintain the structure of the virion");
		
		showOrigin  = new JButton("Origin and history");
		showOrigin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("SARS-CoV2's Origin and History");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText("Initial Detection: SARS-CoV-2 was first identified in December 2019 in Wuhan, China, linked to a seafood market.\r\n"
						+ "Global Spread: The virus spread rapidly, leading the WHO to declare a pandemic in March 2020.\r\n"
						+ "Virus Characteristics: SARS-CoV-2 is a betacoronavirus, genetically similar to bat coronaviruses, indicating a zoonotic origin, potentially via an intermediate host like pangolins.\r\n"
						+ "Origin Theories:\r\n"
						+ "  - Zoonotic Spillover: The predominant theory is natural transmission from animals to humans.\r\n"
						+ "  - Lab Leak Hypothesis: A less supported theory suggests accidental release from a laboratory.\r\n"
						+ "Phylogenetic Studies: These track the virus's mutations and identify variants such as Alpha, Delta, and Omicron.\r\n"
						+ "Ongoing Research: Efforts continue to understand the virus's origins and prevent future pandemics, focusing on improved surveillance and rapid response to emerging infectious diseases."); 
				
				frame.add(new JScrollPane(area));
			}
			
		});
		
		mainPanel.add(showOrigin, BorderLayout.SOUTH);
		
		showStructure = new JButton("Show Structure");
		showStructure.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				virus.showStructure();
				JFrame frame = new JFrame("SARS-CoV2's Structure");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JButton structureGUI = new JButton("Struture Model");
				structureGUI.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Covid19StructureGUI modelFrame = new Covid19StructureGUI();
						modelFrame.setVisible(true);
						modelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					}
					
				});
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText(virus.structureToString()); 
				
				main.add(new JScrollPane(area), BorderLayout.CENTER);
				main.add(structureGUI, BorderLayout.SOUTH);
				
			}
			
		});
		mainPanel.add(showStructure);
		
		showInfectionProcess = new JButton("Show Infection Process");
		showInfectionProcess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("SARS-CoV2's Infection Process");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText(virus.infectionProcessToString()); 
				
				frame.add(new JScrollPane(area));
			}
			
		});
		mainPanel.add(showInfectionProcess);
		
		back = new JButton("Back");
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(LipidVirusPanel);
			}
			
		});
		mainPanel.add(back);
		
		return mainPanel;
	}
	
	private JPanel createHIVPanel() {
		JButton showOrigin;
		JButton showStructure;
		JButton showInfectionProcess;
		JButton back;
		JPanel mainPanel;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		
		ArrayList<String> capsidProteins = new ArrayList<String>();
		ArrayList<String> functionProteins = new ArrayList<String>();
		Capsid capsid = new Capsid("conical", capsidProteins, "The capsid is crucial for protecting the viral RNA and enzymes like reverse transciptase, integrase, and protease");
		AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "two identical copies of single-stranded, positive-sense RNA");
		Envelope envelope = new Envelope("The envelope is derived from the host cell membrane and is studded with viral glycoproteins, primarily gp120 and gp41.", functionProteins, "The envelope makes HIV more susceptible to environmental factors like detergents, heat, and drying, which can inactivate the virus");
		HIVVirus virus = new HIVVirus("HIV", "Retrovirus", capsid, acidNu, envelope, true, 120, "spherical");
		capsidProteins.add("p24 proteins");
		capsidProteins.add("gp120 glycoproteins");
		capsidProteins.add("gp41 glycoproteins");
		functionProteins.add("gp120: Facilitates binding to the CD4 receptor and co-receptors (CCR5 or CXCR4) on host cells");
		functionProteins.add("gp41: Mediates the fusion of the viral envelope with the host cell membrane, allowing entry");
		
		showOrigin  = new JButton("Origin and history");
		showOrigin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("HIV's Origin and History");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText("Discovery: HIV was identified in the early 1980s during outbreaks among various populations, including gay men and hemophiliacs.\r\n"
						+ "Origins: HIV-1 likely originated from a chimpanzee virus (SIVcpz) in Central Africa, while HIV-2 likely came from a related virus in West Africa.\r\n"
						+ "Zoonotic Transmission: HIV crossed to humans through exposure to infected primate blood, possibly during hunting or butchering activities.\r\n"
						+ "Epidemic Spread: HIV spread rapidly through sexual contact, blood transfusions, and shared needles, exacerbated by lack of awareness and stigma.\r\n"
						+ "Pandemic Impact: HIV/AIDS has caused millions of deaths globally and disproportionately affects vulnerable populations.\r\n"
						+ "Scientific Advances**: Antiretroviral therapy (ART) has transformed HIV from a deadly disease to a manageable condition, alongside prevention strategies like condom use and PrEP.\r\n"
						+ "Challenges: Stigma, discrimination, and access to treatment and prevention services remain challenges in combating HIV/AIDS.\r\n"
						+ "Global Response: Coordinated efforts by governments, organizations, healthcare providers, and activists are ongoing to address the HIV/AIDS epidemic and its impacts.");
				
				frame.add(new JScrollPane(area));
			}
			
		});
		
		mainPanel.add(showOrigin, BorderLayout.SOUTH);
		
		showStructure = new JButton("Show Structure");
		showStructure.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				virus.showStructure();
				JFrame frame = new JFrame("HIV's Structure");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JButton structureGUI = new JButton("Struture Model");
				structureGUI.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						HIVStructureGUI modelFrame = new HIVStructureGUI();
						modelFrame.setVisible(true);
						modelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					}
					
				});
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText(virus.structureToString()); 
				
				main.add(new JScrollPane(area), BorderLayout.CENTER);
				main.add(structureGUI, BorderLayout.SOUTH);
				
			}
			
		});
		mainPanel.add(showStructure);
		
		showInfectionProcess = new JButton("Show Infection Process");
		showInfectionProcess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("HIV's Infection Process");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText(virus.infectionProcessToString()); 
				
				frame.add(new JScrollPane(area));
			}
			
		});
		mainPanel.add(showInfectionProcess);
		
		back = new JButton("Back");
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(LipidVirusPanel);
			}
			
		});
		mainPanel.add(back);
		
		return mainPanel;
	}
	
	
	private JPanel createNonLipidVirusPanel() {
		JButton NoroButton, RotaButton;
		JButton back;
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
		
		back = new JButton("Back");
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showMainMenu();
			}
			
		});
		mainPanel.add(back);
		
		return mainPanel;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            VirusInfoGUI app = new VirusInfoGUI();
            app.setVisible(true);
        });
	}
}
