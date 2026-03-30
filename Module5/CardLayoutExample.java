import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("CardLayout");

        CardLayout cl = new CardLayout();
        JPanel panel = new JPanel(cl);

        JPanel p1 = new JPanel();
        JButton b1 = new JButton("Go to Home");
        p1.add(b1);

        JPanel p2 = new JPanel();
        JButton b2 = new JButton("Back");
        p2.add(b2);

        panel.add(p1, "Login");
        panel.add(p2, "Home");

        b1.addActionListener(e -> cl.show(panel, "Home"));
        b2.addActionListener(e -> cl.show(panel, "Login"));

        f.add(panel);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}