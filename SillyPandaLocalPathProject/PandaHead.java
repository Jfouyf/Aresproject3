public class PandaHead extends PandaPart {
    protected ImageIcon headImage;

    public PandaHead() {
        super();
        headImage = loadImage("/Users/ajsun/Desktop/head.jpg");
        description += "Added panda head. ";
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        headImage.paintIcon(this, g, 0, 0);
    }
}