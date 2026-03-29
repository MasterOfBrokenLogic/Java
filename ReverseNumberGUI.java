import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Reverse Number");

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 100, 100, 30);

        JButton b = new JButton("Reverse");
        b.setBounds(50, 150, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t1.getText());
                int rev = 0;

                while(num > 0) {
                    rev = rev * 10 + num % 10;
                    num = num / 10;
                }

                t2.setText(String.valueOf(rev));
            }
        });

        f.add(t1); f.add(t2); f.add(b);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
