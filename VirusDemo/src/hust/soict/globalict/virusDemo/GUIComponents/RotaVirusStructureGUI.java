package hust.soict.globalict.virusDemo.GUIComponents;

import javax.swing.*;
import java.awt.*;

public class RotaVirusStructureGUI extends JFrame{
	
    public RotaVirusStructureGUI() {
        setTitle("Rotavirus Structure");
        setSize(600, 600);
        add(new RotavirusPanel());
	}
    
    class RotavirusPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawRotavirus(g);
        }

        private void drawRotavirus(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;

            // Draw outer layer (Outer Capsid)
            g2d.setColor(Color.BLUE);
            g2d.fillOval(centerX - 200, centerY - 200, 400, 400);

            // Draw middle layer (Intermediate Capsid)
            g2d.setColor(Color.GREEN);
            g2d.fillOval(centerX - 150, centerY - 150, 300, 300);

            // Draw inner layer (Inner Capsid)
            g2d.setColor(Color.YELLOW);
            g2d.fillOval(centerX - 100, centerY - 100, 200, 200);

            // Draw core (Genetic Material)
            g2d.setColor(Color.RED);
            g2d.fillOval(centerX - 50, centerY - 50, 100, 100);

            // Draw spike proteins
            g2d.setColor(Color.WHITE);
            for (int i = 0; i < 360; i += 30) {
                double angle = Math.toRadians(i);
                int x1 = centerX + (int) (200 * Math.cos(angle));
                int y1 = centerY + (int) (200 * Math.sin(angle));
                int x2 = centerX + (int) (240 * Math.cos(angle));
                int y2 = centerY + (int) (240 * Math.sin(angle));
                g2d.drawLine(x1, y1, x2, y2);
            }

            // Draw labels
            g2d.setColor(Color.BLACK);
            g2d.drawString("Outer Capsid", centerX - 50, centerY - 220);
            g2d.drawString("Intermediate Capsid", centerX - 70, centerY - 170);
            g2d.drawString("Inner Capsid", centerX - 50, centerY - 120);
            g2d.drawString("Genetic Material", centerX - 50, centerY - 70);
            g2d.drawString("Spike Proteins", centerX + 220, centerY - 10);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	RotaVirusStructureGUI frame = new RotaVirusStructureGUI();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
