import javax.swing.ImageIcon;
import java.awt.Graphics;

public class PandaMouth extends PandaNose {
    protected ImageIcon mouthImage;
    private boolean tongueOut;

    public PandaMouth() {
        super();
        tongueOut = Math.random() > 0.5;
        if (tongueOut) {
            mouthImage = loadImage("/Users/ajsun/Desktop/mouse-1.png");
            description += "Chose tongue-out mouth 😛. ";
        } else {
            mouthImage = loadImage("/Users/ajsun/Desktop/mouse-2.png");
            description += "Chose big smile 😁. ";
        }
        System.out.println("Mouth: " + (tongueOut ? "tongue" : "smile"));
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mouthImage.paintIcon(this, g, 20 , 100); 
    }
}
