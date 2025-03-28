import javax.swing.ImageIcon;
import java.awt.Graphics;

public class PandaEyes extends PandaHead {
    protected ImageIcon eyesImage;

    public PandaEyes() {
        super();
        eyesImage = loadImage("/Users/ajsun/Desktop/eye.png");
        description += "Added anime eyes. ";
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        eyesImage.paintIcon(this, g, 40, -30);
    }
}