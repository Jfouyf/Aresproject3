import javax.swing.*;

public class FinalPandaApp extends JFrame {
    PandaMouth panda;

    public FinalPandaApp() {
        setTitle("Silly Panda Generator");
        setSize(320, 370);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        panda = new PandaMouth();
        panda.setBounds(0, 0, 300, 300);

        JLabel label = new JLabel(panda.getDescription());
        label.setBounds(10, 300, 300, 30);

        add(panda);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FinalPandaApp();
    }
}