package hust.soict.globalict.virusDemo.GUIComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizApp extends JFrame implements ActionListener{
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
