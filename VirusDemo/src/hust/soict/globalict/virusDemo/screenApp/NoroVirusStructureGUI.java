package hust.soict.globalict.virusDemo.screenApp;
import javax.swing.*;
import java.awt.*;

public class NoroVirusStructureGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NorovirusFrame frame = new NorovirusFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class NorovirusFrame extends JFrame {
    public NorovirusFrame() {
        setTitle("Norovirus Structure");
        setSize(600, 600);
        add(new NorovirusPanel());
    }
}

class NorovirusPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawNorovirus(g);
    }

    private void drawNorovirus(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Draw outer layer (Capsid)
        g2d.setColor(Color.BLUE);
        g2d.fillOval(centerX - 150, centerY - 150, 300, 300);

        // Draw inner core (Genetic Material)
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(centerX - 75, centerY - 75, 150, 150);

        // Draw spike proteins
        g2d.setColor(Color.WHITE);
        for (int i = 0; i < 360; i += 20) {
            double angle = Math.toRadians(i);
            int x1 = centerX + (int) (150 * Math.cos(angle));
            int y1 = centerY + (int) (150 * Math.sin(angle));
            int x2 = centerX + (int) (180 * Math.cos(angle));
            int y2 = centerY + (int) (180 * Math.sin(angle));
            g2d.drawLine(x1, y1, x2, y2);
        }

        // Draw labels
        g2d.setColor(Color.BLACK);
        g2d.drawString("Capsid", centerX - 25, centerY - 160);
        g2d.drawString("Genetic Material", centerX - 50, centerY - 80);
        g2d.drawString("Spike Proteins", centerX + 180, centerY - 10);
    }
}
