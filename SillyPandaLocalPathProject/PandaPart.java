import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class PandaPart extends JPanel {
    protected String description;

    public PandaPart() {
        this.description = "Building a silly panda: ";
    }

    public String getDescription() {
        return description;
    }

    protected ImageIcon loadImage(String absolutePath) {
        return new ImageIcon(absolutePath);
    }
}