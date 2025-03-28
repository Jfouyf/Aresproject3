import javax.swing.ImageIcon;
import java.awt.Graphics;

public class PandaHead extends PandaPart {
    protected ImageIcon headImage;

    public PandaHead() {
        super();
        headImage = loadImage("/Users/ajsun/Desktop/head.png");
        description += "Added panda head. ";
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        headImage.paintIcon(this, g, 0, 0); 
    }
}
