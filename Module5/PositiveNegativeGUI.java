import javax.swing.*;
import java.awt.event.*;

public class PositiveNegativeGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Check Number");

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 100, 100, 30);

        JButton b = new JButton("Check");
        b.setBounds(50, 150, 100, 30);

        b.addActionListener(e -> {
            int num = Integer.parseInt(t1.getText());

            if(num >= 0)
                t2.setText("Positive");
            else
                t2.setText("Negative");
        });

        f.add(t1); f.add(t2); f.add(b);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}