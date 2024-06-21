package hust.soict.globalict.virusDemo.screenApp;

import javax.swing.*;

import hust.soict.globalict.virusDemo.GUIComponents.Covid19StructureGUI;
import hust.soict.globalict.virusDemo.GUIComponents.HIVStructureGUI;
import hust.soict.globalict.virusDemo.GUIComponents.NoroVirusStructureGUI;
import hust.soict.globalict.virusDemo.GUIComponents.QuizApp;
import hust.soict.globalict.virusDemo.GUIComponents.RotaVirusStructureGUI;
import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;
import hust.soict.globalict.virusDemo.viruses.CovidVirus;
import hust.soict.globalict.virusDemo.viruses.HIVVirus;
import hust.soict.globalict.virusDemo.viruses.NoroVirus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

//main GUI application using JavaSwing
public class VirusInfoGUI extends JFrame {
	
	//buttons
	JButton LipidVirus, NonLipidVirus, Quiz, exitButton; 
	
	//menu bar
	JMenuItem Help, Back;
	
	//for main content
	JPanel center;
	
	JPanel virusSelectionPanel, LipidVirusPanel, NonLipidVirusPanel, Covid19Panel, HIVPanel, NoroVirusPanel, RotaVirusPanel;
	
	public VirusInfoGUI() {
		//set title for app
		setTitle("Virus Investigation Application"); 
		
		//set icon
		Image icon = Toolkit.getDefaultToolkit().getImage("F:\\eclipse_workspace\\VirusDemo\\src\\virus_app_logo.jpg");  
		setIconImage(icon);
		
		//window size
		setSize(800, 600);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		LipidVirusPanel = createLipidVirusPanel(); //JPanel for Lipid Virus selection
		NonLipidVirusPanel = createNonLipidVirusPanel(); //JPanel for Non Lipid Virus selection
		
		Covid19Panel = createCovid19Panel(); //JPanel for covid19
		HIVPanel = createHIVPanel(); //JPanel for HIV
		
		NoroVirusPanel = createNoroVirusPanel(); //JPanel for Norovirus
		RotaVirusPanel = createRotaVirusPanel(); //JPanel for Rotavirus
		
		//show main Menu
		showMainMenu();
	}

	void showMainMenu() {
		getContentPane().removeAll();
		
		//back ground picture for the mainMenu
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("F:\\eclipse_workspace\\VirusDemo\\src\\Red-Cross.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			add(picLabel, BorderLayout.CENTER);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		add(createNorth(), BorderLayout.NORTH);
		add(createSouth(), BorderLayout.SOUTH);
	}

	//North Component for the menu bar
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		return north;
	}
	
	//create menuBar in the North Component
	JMenuBar createMenuBar() {
		// TODO Auto-generated method stub
		JMenu menu = new JMenu("Options");
		
		Help = new JMenuItem("Help");
		Back = new JMenuItem("Back to main");
		menu.add(Help);
		menu.add(Back);
		
		//Help button for description of the use of the program
		Help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//message popping up using JOptionPane
				JOptionPane.showMessageDialog(Help, "This application helps users learn about different viruses.\n\n" +
                        "Select a type of virus to see its structure and understand the infection process.\n\n" +
                		"Select the Quiz option do participate in a fun quiz about viruses\n\n"+
                        "Use the 'Back' button to return to the previous menu.",
                "Help", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//Back button to return to the main menu at any time
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMainMenu();
			}
		});
		
		//menu bar for storing the back button and the help button
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
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
	
	private void switchPanel(JPanel panel) {
        center.removeAll();
        center.add(panel, BorderLayout.CENTER);
        center.revalidate();
        center.repaint();
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
				frame.setSize(1024, 200);
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
				// Step 1: attach
		        JOptionPane.showMessageDialog(null, "Step 1: Attach\n" +
		        		virus.getName() + " binds to the ACE2 receptor on respiratory epithelial cells using " + virus. getCapsid().getProteins().get(0));

		        // Step 2: penetrate
		        JOptionPane.showMessageDialog(null, "Step 2: Penetrate\n" +
		        		virus.getName() + " fuse with the host cell membrane or endocytosis");

		        // Step 3: replicate
		        JOptionPane.showMessageDialog(null, "Step 3: Replicate\n" +
		        		virus.getName() + "'s viral RNA is replicated and transcribed by the host cell machinery. The RNA-dependent RNA polymerase synthesizes new viral RNA");

		        // Step 4: assemble
		        JOptionPane.showMessageDialog(null, "Step 4: Assemble\n" +
		        		virus.getName() + " assemble new virions in the endoplasmic reticulum and Golgi apparatus");

		        // Step 5: release
		        JOptionPane.showMessageDialog(null, "Step 5: Release\n" +
		                "New virions are transported to the cell surface in vesicles and released by exocytosis to infect other cells");
		        
		        // Final Message
		        JOptionPane.showMessageDialog(null, "This concludes the Sars-CoV2 infection process. Stay informed and take preventive measures.");
		        
				
				virus.showInfectionProcess();
				JFrame frame = new JFrame("SARS-CoV2's Infection Process");
				frame.setSize(1024, 150);
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
				frame.setSize(1024, 200);
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
				// Step 1: attach
		        JOptionPane.showMessageDialog(null, "Step 1: Attach\n" +
		        		virus.getName() + " binds to the CD4 receptor on the surface of the target cell using " + virus.getCapsid().getProteins().get(1));

		        // Step 2: penetrate
		        JOptionPane.showMessageDialog(null, "Step 2: Penetrate\n" +
		        		virus.getName() + " fuse with the host cell membrane");

		        // Step 3: replicate
		        JOptionPane.showMessageDialog(null, "Step 3: Replicate\n" +
		        		virus.getName() + " reverse transcription of RNA into DNA, then integrate into host genome");

		        // Step 4: assemble
		        JOptionPane.showMessageDialog(null, "Step 4: Assemble\n" +
		        		virus.getName() + " assemble new virions in the host cell");

		        // Step 5: release
		        JOptionPane.showMessageDialog(null, "Step 5: Release\n" +
		                "New virions bud off from the host cell, acquiring a portion of the host cell membrane as their envelope, and go on to infect other cells");
		        
		        // Final Message
		        JOptionPane.showMessageDialog(null, "This concludes the HIV infection process. Stay informed and take preventive measures.");
		        
		        //show text of the infection process
				virus.showInfectionProcess();
				JFrame frame = new JFrame("HIV's Infection Process");
				frame.setSize(1024, 150);
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
				switchPanel(NoroVirusPanel);
			}
				
		});
		mainPanel.add(NoroButton);
			
		RotaButton = new JButton("RotaVirus");
		RotaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switchPanel(RotaVirusPanel);
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
	
	private JPanel createNoroVirusPanel() {
		JButton showOrigin;
		JButton showStructure;
		JButton showInfectionProcess;
		JButton back;
		JPanel mainPanel;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		

		ArrayList<String> capsidProteins = new ArrayList<String>();
		Capsid capsid = new Capsid("icosahedral", capsidProteins, "the icosahedral shape provides stability in various environments, facilitating transmission through contaminated food and water");
		AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "single, positive-sense RNA genome");
		capsidProteins.add("protein VP1");
		capsidProteins.add("structural protein VP2");
		NoroVirus virus = new NoroVirus("Norovirus", "Calicivirus", capsid, acidNu, false, 40, "icosahedral");
		
		showOrigin  = new JButton("Origin and history");
		showOrigin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("HIV's Origin and History");
				frame.setSize(1024, 200);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText("Discovery: Norovirus was first identified in 1972 following an outbreak in Norwalk, Ohio.\r\n"
						+ "Virus Family: It belongs to the Caliciviridae family and is a non-enveloped, single-stranded RNA virus.\r\n"
						+ "Transmission: Spreads via the fecal-oral route, contaminated food or water, person-to-person contact, and surfaces.\r\n"
						+ "Symptoms: Causes acute gastroenteritis with vomiting, diarrhea, stomach pain, and nausea, typically lasting 1-3 days.\r\n"
						+ "Outbreak Settings: Common in closed environments like cruise ships, hospitals, schools, and nursing homes.\r\n"
						+ "Genetic Diversity: High genetic variability helps the virus evade immunity, with GII.4 being a prevalent strain.\r\n"
						+ "Global Impact: Leading cause of gastroenteritis, responsible for 685 million cases annually and significant healthcare costs.\r\n"
						+ "Prevention: Key methods include handwashing, proper food handling, sanitation, and outbreak management. Vaccine development is ongoing.");
				
				frame.add(new JScrollPane(area));
			}
			
		});
		
		mainPanel.add(showOrigin, BorderLayout.SOUTH);
		
		showStructure = new JButton("Show Structure");
		showStructure.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				virus.showStructure();
				JFrame frame = new JFrame("Norovirus's Structure");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JButton structureGUI = new JButton("Struture Model");
				structureGUI.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoroVirusStructureGUI modelFrame = new NoroVirusStructureGUI();
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
				// Step 1: attach
		        JOptionPane.showMessageDialog(null, "Step 1: Attach\n" +
		        		virus.getName() + " binds to histo-blood group antigens (HBGAs) on the surface of epithelial cells in the gastrointestinal tract");

		        // Step 2: penetrate
		        JOptionPane.showMessageDialog(null, "Step 2: Penetrate\n" +
		        		virus.getName() + " enters the cell via endocytosis");

		        // Step 3: replicate
		        JOptionPane.showMessageDialog(null, "Step 3: Replicate\n" +
		        		virus.getName() + "'s viral RNA-dependent RNA polymerase synthesizes a complementary negative-sense RNA, serving as a template for the production of new positive-sense RNA genomes");

		        // Step 4: assemble
		        JOptionPane.showMessageDialog(null, "Step 4: Assemble\n" +
		        		virus.getName() + "'s viral proteins and genomes are assembled into virions in the cytoplasm");

		        // Step 5: release
		        JOptionPane.showMessageDialog(null, "Step 5: Release\n" +
		                "Virions are released from the host cell, often leading to cell death and contributing to the symptoms of gastroenteritis");
		        
		        // Final Message
		        JOptionPane.showMessageDialog(null, "This concludes the Norovirus infection process. Stay informed and take preventive measures.");
		        
				virus.showInfectionProcess();
				JFrame frame = new JFrame("Norovirus's Infection Process");
				frame.setSize(1024, 150);
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
				switchPanel(NonLipidVirusPanel);
			}
			
		});
		mainPanel.add(back);
		
		return mainPanel;
	}
	
	//RotaVirus Panel
	private JPanel createRotaVirusPanel() {
		JButton showOrigin;
		JButton showStructure;
		JButton showInfectionProcess;
		JButton back;
		JPanel mainPanel;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		

		ArrayList<String> capsidProteins = new ArrayList<String>();
		Capsid capsid = new Capsid("triple-layered icosahedral", capsidProteins, "the triple-layered capsid provides robustness and protection for the viral genome and enzymes required for replication");
		AcidNu acidNu = new AcidNu("RNA", "Double-stranded RNA", "11 segments of double-stranded RNA");
		capsidProteins.add("glycoprotein VP7");
		capsidProteins.add("spike protein VP4");
		capsidProteins.add("protein VP6");
		capsidProteins.add("protein VP2");
		NoroVirus virus = new NoroVirus("Rotavirus", "Reovirus", capsid, acidNu, false, 70, "icosahedral");
		
		showOrigin  = new JButton("Origin and history");
		showOrigin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Rotavirus's Origin and History");
				frame.setSize(1024, 200);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JPanel main = new JPanel();
				main.setLayout(new BorderLayout());
				frame.add(main);
				
				JTextArea area = new JTextArea();
				area.setEditable(false);
				area.setText("Discovery: Rotavirus was first discovered in 1973 by Ruth Bishop and her team in Melbourne, Australia.\r\n"
						+ "Virus Family: It is a double-stranded RNA virus from the Reoviridae family.\r\n"
						+ "Transmission: Spreads via the fecal-oral route, through contaminated hands, surfaces, objects, food, and water.\r\n"
						+ "Symptoms: Causes severe gastroenteritis with diarrhea, vomiting, fever, and abdominal pain, especially in young children.\r\n"
						+ "Global Impact: Leading cause of severe diarrhea in children, causing 215,000 deaths annually and significant morbidity.\r\n"
						+ "Prevention: Vaccines (Rotarix and RotaTeq) are highly effective; hygiene and sanitation practices are also important.\r\n"
						+ "Seasonality: Peaks in winter in temperate climates, year-round in tropical regions.\r\n"
						+ "Genetic Diversity: High genetic variability due to genome reassortment, allowing for new strains to emerge.");
				
				frame.add(new JScrollPane(area));
			}
			
		});
		
		mainPanel.add(showOrigin, BorderLayout.SOUTH);
		
		showStructure = new JButton("Show Structure");
		showStructure.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				virus.showStructure();
				JFrame frame = new JFrame("Rotavirus's Structure");
				frame.setSize(1024, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				JButton structureGUI = new JButton("Struture Model");
				structureGUI.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						RotaVirusStructureGUI modelFrame = new RotaVirusStructureGUI();
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
				// Step 1: attach
		        JOptionPane.showMessageDialog(null, "Step 1: Attach\n" +
		        		virus.getName() + " attaches to host cell surface receptors using " + capsid.getProteins().get(1));

		        // Step 2: penetrate
		        JOptionPane.showMessageDialog(null, "Step 2: Penetrate\n" +
		        		virus.getName() + " is then taken up by endocytosis");

		        // Step 3: replicate
		        JOptionPane.showMessageDialog(null, "Step 3: Replicate\n" +
		        		virus.getName() + "'s viral mRNAs are translated by the host's ribosomes into viral proteins, the viral RNA polymerase replicates the viral RNA");

		        // Step 4: assemble
		        JOptionPane.showMessageDialog(null, "Step 4: Assemble\n" +
		        		virus.getName() + "'s new viral particles are assembled in the cytoplasm");

		        // Step 5: release
		        JOptionPane.showMessageDialog(null, "Step 5: Release\n" +
		                "Mature virions are released either by cell lysis or by budding from the host cell, causing cell damage and leading to the symptoms of gastroenteritis");
		        
		        // Final Message
		        JOptionPane.showMessageDialog(null, "This concludes the Rotavirus infection process. Stay informed and take preventive measures.");
		        
				
				virus.showInfectionProcess();
				JFrame frame = new JFrame("Rotavirus's Infection Process");
				frame.setSize(1024, 150);
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
				switchPanel(NonLipidVirusPanel);
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
