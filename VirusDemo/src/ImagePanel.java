

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel() {
        // Set a default image or leave it blank
        try {
            image = ImageIO.read(new File("default.jpg")); // default image path
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setImage(String path) {
        try {
            image = ImageIO.read(new File(path));
            repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
