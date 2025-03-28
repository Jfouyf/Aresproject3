public class PandaEyes extends PandaHead {
    protected ImageIcon eyesImage;

    public PandaEyes() {
        super();
        eyesImage = loadImage("/Users/ajsun/Desktop/eye.jpg");
        description += "Added anime eyes. ";
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        eyesImage.paintIcon(this, g, 0, 0);
    }
}