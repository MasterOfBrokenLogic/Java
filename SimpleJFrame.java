import javax.swing.*;

public class SimpleJFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame");

        JLabel l = new JLabel("Welcome to Java Swing");
        l.setBounds(50, 50, 200, 30);

        f.add(l);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
