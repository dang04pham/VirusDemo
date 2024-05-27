import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Virus1 extends JFrame {

    public Virus1() {
        setTitle("Virus Investigation Application");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        showMainMenu();
       
    }

    private void showMainMenu() {
    	getContentPane().removeAll();
        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Virus Investigation Application", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        JButton lipidVirusButton = new JButton("Lipid-Enveloped Virus");
        JButton nonLipidVirusButton = new JButton("Non-Lipid-Enveloped Virus");
        JButton helpButton = new JButton("Help");
        JButton exitButton = new JButton("Exit");
        JButton doQuiz = new JButton("Quiz");

        lipidVirusButton.addActionListener(e -> showVirusSelection(true));
        nonLipidVirusButton.addActionListener(e -> showVirusSelection(false));
        helpButton.addActionListener(e -> showHelp());
        exitButton.addActionListener(e -> confirmExit());
        doQuiz.addActionListener(e -> loadApp());

        buttonPanel.add(lipidVirusButton);
        buttonPanel.add(nonLipidVirusButton);
        buttonPanel.add(helpButton);
        buttonPanel.add(exitButton);
        buttonPanel.add(doQuiz);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        add(mainPanel);
        
        revalidate();
        repaint();
    }

    private void loadApp() {
    	new QuizApp();
   }

	private void showVirusSelection(boolean isLipidEnveloped) {
        getContentPane().removeAll();
        JPanel virusPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(isLipidEnveloped ? "Lipid-Enveloped Viruses" : "Non-Lipid-Enveloped Viruses", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        virusPanel.add(titleLabel, BorderLayout.NORTH);

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
                detailsText.setText("HIV is a lipid-enveloped virus. \nIt has a complex structure including a lipid bilayer, glycoproteins, and RNA genome.");
            } else {
                detailsText.setText("COVID-19 is a lipid-enveloped virus. \nIt contains spike proteins, an RNA genome, and a lipid membrane.");
            }
        } else {
            if (isFirstVirus) {
                detailsText.setText("Rotavirus is a non-lipid-enveloped virus. \n It has a triple-layered protein coat and an RNA genome.");
            } else {
                detailsText.setText("Capsid:\r\n"
                		+ "\r\n"
                		+ "Shape and Composition: Norovirus has an icosahedral capsid, meaning it has a roughly spherical shape made \nup of 180 copies of a single major structural protein called VP1 (Viral Protein 1).\r\n"
                		+ "VP1 Protein: VP1 is organized into 90 dimers, forming the characteristic icosahedral shape. The capsid is around \n38-40 nanometers in diameter.\r\n"
                		+ "P and S Domains: VP1 has two main domains, the shell \n(S) domain and the protruding (P) domain. The S domain forms the structural foundation, while the P domain, extending from the S domain, is involved in host receptor binding and immune system evasion.\r\n"
                		+ "Genomic Material:\r\n"
                		+ "\r\n"
                		+ "RNA Genome: Inside the capsid, Norovirus has a single-stranded, positive-sense RNA genome. This RNA genome is approximately 7.5 to 7.7 kilobases in length.\r\n"
                		+ "ORFs: The RNA genome contains three open reading frames (ORFs):\r\n"
                		+ "ORF1: Encodes non-structural proteins involved in viral replication.\r\n"
                		+ "ORF2: Encodes the major capsid protein VP1.\r\n"
                		+ "ORF3: Encodes a minor structural protein VP2 that plays a role in stabilizing the capsid and packaging the viral RNA.\r\n"
                		+ "Minor Structural Protein:\r\n"
                		+ "\r\n"
                		+ "VP2 Protein: A less abundant protein found inside the capsid, thought to interact with the viral RNA and VP1, aiding in the assembly and stability of the viral particle.\r\n"
                		+ "The combination of these structural components makes Norovirus highly effective in transmission and infection, leading to its role as a common cause of gastroenteritis outbreaks. Its resilience and simplicity underscore the challenges in developing effective treatments and preventive measures against Norovirus infections");
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

    private void showHelp() {
        JOptionPane.showMessageDialog(this,
                "This application helps users learn about different viruses.\n\n" +
                        "Select a type of virus to see its structure and understand the infection process.\n\n" +
                		"Select the Quiz option do participate in a fun quiz about viruses\n\n"+
                        "Use the 'Back' button to return to the previous menu.",
                "Help", JOptionPane.INFORMATION_MESSAGE);
    }

    private void confirmExit() {
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit the application?", "Exit Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Virus1 app = new Virus1();
            app.setVisible(true);
        });
    }
    
    private class QuizApp extends JFrame implements ActionListener{
        String[][] questions = {
                {"What is the genetic material of a virus?", "DNA or RNA", "Protein", "Lipid", "Carbohydrate"},
                {"Which of these viruses causes COVID-19?", "HIV", "Ebola", "Influenza", "SARS-CoV-2"},
                {"What is the main method of transmission for the flu virus?", "Direct contact", "Airborne droplets", "Water", "Insect bites"},
                {"Which virus is known for causing a pandemic in 2009?", "Zika", "Dengue", "H1N1", "SARS"},
                {"What type of virus is HIV?", "Coronavirus", "Adenovirus", "Papillomavirus", "Retrovirus"}
        };
        String[] correctAnswers = {"DNA or RNA", "SARS-CoV-2", "Airborne droplets", "H1N1", "Retrovirus"};
        
        // GUI components
        JLabel questionLabel;
        JRadioButton[] options = new JRadioButton[4];
        JButton nextButton;
        ButtonGroup optionsGroup;
        
        int currentQuestion = 0;
        int score = 0;
        
        public QuizApp() {
            // Set up the frame
            setTitle("Quiz Application");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLayout(null);

            // Initialize components
            questionLabel = new JLabel();
            questionLabel.setBounds(30, 40, 340, 20);
            add(questionLabel);

            optionsGroup = new ButtonGroup();
            for (int i = 0; i < 4; i++) {
                options[i] = new JRadioButton();
                options[i].setBounds(50, 80 + (i * 30), 300, 20);
                optionsGroup.add(options[i]);
                add(options[i]);
            }

            nextButton = new JButton("Next");
            nextButton.setBounds(150, 220, 100, 30);
            nextButton.addActionListener(this);
            add(nextButton);

            // Load the first question
            loadQuestion(currentQuestion);

            setVisible(true);
        }

        public void loadQuestion(int questionIndex) {
            questionLabel.setText(questions[questionIndex][0]);
            for (int i = 0; i < 4; i++) {
                options[i].setText(questions[questionIndex][i + 1]);
                options[i].setSelected(false);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == nextButton) {
                // Check if any option is selected
            	
            	String selectedAnswer = "";
                boolean answered = false;
                for (int i = 0; i < 4; i++) {
                    if (options[i].isSelected()) {
                        answered = true;
                        selectedAnswer = options[i].getText();
                        if (selectedAnswer.equals(correctAnswers[currentQuestion])) {
                            score++;
                        }
                        break;
                    }
                }
                if (!answered) {
                    JOptionPane.showMessageDialog(this, "Please select an answer");
                    return;
                }
                
                if (!selectedAnswer.equals(correctAnswers[currentQuestion])) {
                    JOptionPane.showMessageDialog(this, "Incorrect! The correct answer is: " + correctAnswers[currentQuestion]);
                } else {
                    JOptionPane.showMessageDialog(this, "Correct!");
                }

                currentQuestion++;
                if (currentQuestion < questions.length) {
                    loadQuestion(currentQuestion);
                } else {
                    JOptionPane.showMessageDialog(this, "Quiz Over! Your score: " + score);
                }
            }
        }
    }
}