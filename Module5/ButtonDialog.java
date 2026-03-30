import javax.swing.*;
import java.awt.event.*;

public class ButtonDialog {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button");

        JButton b = new JButton("Click Me");
        b.setBounds(100, 70, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog d = new JDialog(f, "Dialog");
                JLabel l = new JLabel("Button Clicked");
                l.setBounds(50, 50, 150, 30);

                d.add(l);
                d.setSize(200, 150);
                d.setLayout(null);
                d.setVisible(true);
            }
        });

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}