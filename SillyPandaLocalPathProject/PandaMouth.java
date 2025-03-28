public class PandaMouth extends PandaEyes {
    protected ImageIcon mouthImage;
    private boolean tongueOut;

    public PandaMouth() {
        super();
        tongueOut = Math.random() > 0.5;
        if (tongueOut) {
            mouthImage = loadImage("/Users/ajsun/Desktop/mouse-1.jpg");
            description += "Chose tongue-out mouth 😛. ";
        } else {
            mouthImage = loadImage("/Users/ajsun/Desktop/mouse-2.jpg");
            description += "Chose big smile 😁. ";
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mouthImage.paintIcon(this, g, 0, 0);
    }
}