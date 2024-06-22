package hust.soict.globalict.virusDemo.GUIComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HIVInfectionGUI extends JFrame implements ActionListener {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton nextButton, prevButton;
    private int currentStage;

    public HIVInfectionGUI() {
        setTitle("HIV Infection Process");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create stages
        cardPanel.add(createStagePanel("Stage 1: Acute HIV Infection", "Description of acute HIV infection."), "Stage 1");
        cardPanel.add(createStagePanel("Stage 2: Clinical Latency", "Description of clinical latency."), "Stage 2");
        cardPanel.add(createStagePanel("Stage 3: AIDS", "Description of AIDS."), "Stage 3");

        // Navigation buttons
        nextButton = new JButton("Next");
        prevButton = new JButton("Previous");
        nextButton.addActionListener(this);
        prevButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Add panels to the frame
        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        currentStage = 0;
        updateButtons();

        setVisible(true);
    }

    private JPanel createStagePanel(String title, String description) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(title, JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        JTextArea descriptionArea = new JTextArea(description);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setEditable(false);
        
        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(new JScrollPane(descriptionArea), BorderLayout.CENTER);
        
        return panel;
    }

    private void updateButtons() {
        prevButton.setEnabled(currentStage > 0);
        nextButton.setEnabled(currentStage < 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            currentStage++;
        } else if (e.getSource() == prevButton) {
            currentStage--;
        }
        cardLayout.show(cardPanel, "Stage " + (currentStage + 1));
        updateButtons();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HIVInfectionGUI::new);
    }
}
