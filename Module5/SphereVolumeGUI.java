import javax.swing.*;
import java.awt.event.*;

public class SphereVolumeGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Sphere Volume");

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 100, 100, 30);

        JButton b = new JButton("Calculate");
        b.setBounds(50, 150, 100, 30);

        b.addActionListener(e -> {
            double r = Double.parseDouble(t1.getText());
            double volume = (4.0/3) * 3.14 * r * r * r;

            t2.setText(String.valueOf(volume));
        });

        f.add(t1); f.add(t2); f.add(b);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}