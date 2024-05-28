package hust.soict.globalict.virusDemo.viruses;
import javax.swing.*;
import java.awt.*;

public class Covid19StructureGUI extends JFrame {

    public Covid19StructureGUI() {
        setTitle("COVID-19 Virus Structure");
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

            // Draw spike proteins (S glycoproteins)
            g.setColor(Color.RED);
            for (int i = 0; i < 360; i += 30) {
                int x = (int) (300 + 200 * Math.cos(Math.toRadians(i)));
                int y = (int) (300 + 200 * Math.sin(Math.toRadians(i)));
                g.fillOval(x - 10, y - 10, 20, 20);
                g.drawString("S", x - 5, y - 15);
            }

            // Draw the membrane (M) protein layer
            g.setColor(Color.ORANGE);
            g.fillOval(150, 150, 300, 300);
            g.setColor(Color.BLACK);
            g.drawString("Membrane (M) Protein", 250, 140);

            // Draw the envelope (E) protein layer
            g.setColor(Color.YELLOW);
            g.fillOval(180, 180, 240, 240);
            g.setColor(Color.BLACK);
            g.drawString("Envelope (E) Protein", 260, 170);

            // Draw the nucleocapsid (N) protein
            g.setColor(Color.GREEN);
            g.fillOval(200, 200, 200, 200);
            g.setColor(Color.BLACK);
            g.drawString("Nucleocapsid (N) Protein", 250, 190);

            // Draw the RNA genome
            g.setColor(Color.BLUE);
            g.drawLine(250, 250, 350, 350);
            g.drawLine(350, 250, 250, 350);
            g.drawString("RNA Genome", 270, 240);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Covid19StructureGUI frame = new Covid19StructureGUI();
            frame.setVisible(true);
        });
    }
}
