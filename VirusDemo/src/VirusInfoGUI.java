import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirusInfoGUI {

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        SwingUtilities.invokeLater(VirusInfoGUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Virus Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Add content to the window
        frame.add(new VirusInfoPanel());

        // Display the window
        frame.setVisible(true);
    }
}

class VirusInfoPanel extends JPanel implements ActionListener {
    private JTextArea infoTextArea;
    private JComboBox<String> virusComboBox;

    public VirusInfoPanel() {
        setLayout(new BorderLayout());

        // Create title label
        JLabel titleLabel = new JLabel("Virus Information", JLabel.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(titleLabel, BorderLayout.NORTH);

        // Create drop-down menu
        String[] viruses = {"Coronavirus", "HPV", "HIV"};
        virusComboBox = new JComboBox<>(viruses);
        virusComboBox.addActionListener(this);
        add(virusComboBox, BorderLayout.SOUTH);

        // Create text area for information
        infoTextArea = new JTextArea();
        infoTextArea.setText(getVirusInfo("Coronavirus"));
        infoTextArea.setEditable(false);
        infoTextArea.setLineWrap(true);
        infoTextArea.setWrapStyleWord(true);

        // Add text area to scroll pane
        JScrollPane scrollPane = new JScrollPane(infoTextArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    private String getVirusInfo(String virus) {
        switch (virus) {
            case "HPV":
                return "Human papillomavirus (HPV) is a group of viruses that are extremely common worldwide. " +
                       "HPV is the most common viral infection of the reproductive tract. " +
                       "Most sexually active men and women will be infected at some point in their lives and some may be repeatedly infected.\n\n" +
                       "HPV is usually spread through direct skin-to-skin contact during vaginal, anal, or oral sex with someone who has the virus.\n\n" +
                       "Most HPV infections cause no symptoms and resolve spontaneously. However, persistent infection can lead to diseases such as genital warts and cancer.\n\n" +
                       "Biological Formation: HPV is a small, non-enveloped DNA virus with a circular double-stranded genome. It infects epithelial cells in the skin and mucous membranes. " +
                       "HPV has a unique ability to evade the immune system and can persist in the host cells for long periods.";
            case "HIV":
                return "Human Immunodeficiency Virus (HIV) is a virus that attacks the body's immune system. " +
                       "If HIV is not treated, it can lead to Acquired Immunodeficiency Syndrome (AIDS).\n\n" +
                       "Unlike some other viruses, the human body cannot get rid of HIV completely. Once you have HIV, you have it for life.\n\n" +
                       "HIV is spread through contact with certain body fluids such as blood, semen, vaginal fluids, rectal fluids, and breast milk from a person who has HIV.\n\n" +
                       "No effective cure exists for HIV. But with proper medical care, HIV can be controlled.\n\n" +
                       "Biological Formation: HIV is an enveloped virus with a single-stranded RNA genome. " +
                       "It belongs to the retrovirus family and has a unique enzyme called reverse transcriptase, which allows it to convert its RNA into DNA after entering a host cell. " +
                       "This DNA is then integrated into the host's genome, enabling the virus to replicate and persist.";
            case "Coronavirus":
            default:
                return "Coronavirus disease (COVID-19) is an infectious disease caused by the SARS-CoV-2 virus.\n\n" +
                       "Most people infected with the virus will experience mild to moderate respiratory illness and recover without requiring special treatment. " +
                       "However, some will become seriously ill and require medical attention.\n\n" +
                       "To prevent the spread of COVID-19:\n" +
                       "- Maintain a safe distance from others (at least 1 meter), even if they don’t appear to be sick.\n" +
                       "- Wear a mask in public, especially indoors or when physical distancing is not possible.\n" +
                       "- Clean your hands often. Use soap and water, or an alcohol-based hand rub.\n" +
                       "- Get vaccinated when it’s your turn. Follow local guidance about vaccination.\n" +
                       "- Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.\n" +
                       "- Stay home if you feel unwell.\n\n" +
                       "Seek medical attention if you have a fever, cough, and difficulty breathing.\n\n" +
                       "Biological Formation: Coronaviruses are enveloped viruses with a single-stranded RNA genome. " +
                       "They are characterized by spike-like projections on their surface, which give them a crown-like appearance under a microscope. " +
                       "The virus attaches to host cells via these spike proteins and enters the cells to replicate.";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == virusComboBox) {
            String selectedVirus = (String) virusComboBox.getSelectedItem();
            infoTextArea.setText(getVirusInfo(selectedVirus));
        }
    }
}
