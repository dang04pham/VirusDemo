package hust.soict.globalict.virusDemo.viruses;
import javax.swing.*;
import java.awt.*;

public class HIVStructureGUI extends JFrame {

    public HIVStructureGUI() {
        setTitle("HIV Virus Structure");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(new VirusPanel());
    }

    class VirusPanel extends JPanel {
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawVirusStructure(g);
        }

        private void drawVirusStructure(Graphics g) {
            // Set colors and font
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 12));

            // Draw the envelope
            g.setColor(Color.PINK);
            g.fillOval(100, 100, 400, 400);
            g.setColor(Color.BLACK);
            g.drawString("Envelope (Lipid Bilayer)", 230, 90);

            // Draw gp120 and gp41
            g.setColor(Color.RED);
            g.fillOval(200, 120, 30, 30);
            g.drawString("gp120", 210, 115);
            g.fillOval(370, 120, 30, 30);
            g.drawString("gp41", 380, 115);

            // Draw the matrix layer
            g.setColor(Color.YELLOW);
            g.fillOval(150, 150, 300, 300);
            g.setColor(Color.BLACK);
            g.drawString("Matrix (p17)", 260, 140);

            // Draw the capsid
            g.setColor(Color.GREEN);
            g.fillOval(200, 200, 200, 200);
            g.setColor(Color.BLACK);
            g.drawString("Capsid (p24)", 270, 190);

            // Draw the RNA genome
            g.setColor(Color.BLUE);
            g.drawLine(250, 250, 350, 350);
            g.drawLine(350, 250, 250, 350);
            g.drawString("RNA Genome", 270, 240);

            // Draw the enzymes
            g.setColor(Color.MAGENTA);
            g.drawString("Reverse Transcriptase", 270, 260);
            g.drawString("Integrase", 270, 280);
            g.drawString("Protease", 270, 300);

            // Draw nucleocapsid
            g.setColor(Color.ORANGE);
            g.drawString("Nucleocapsid (p7)", 270, 320);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HIVStructureGUI frame = new HIVStructureGUI();
            frame.setVisible(true);
        });
    }
}
