import javax.swing.ImageIcon;
import java.awt.Graphics;

public class PandaNose extends PandaEyes {
    protected ImageIcon noseImage;

    public PandaNose() {
        super();
        noseImage = loadImage("/Users/ajsun/Desktop/nose.png");

  
        System.out.println("Nose image loaded: " + (noseImage != null));
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);


        noseImage.paintIcon(this, g, 100, 70);
    }
}