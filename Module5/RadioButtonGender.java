import javax.swing.*;
import java.awt.event.*;

public class RadioButtonGender {
    public static void main(String[] args) {
        JFrame f = new JFrame("Gender");

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(50, 50, 100, 30);

        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(50, 80, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton b = new JButton("Show");
        b.setBounds(50, 120, 80, 30);

        JLabel l = new JLabel();
        l.setBounds(50, 160, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(r1.isSelected()) l.setText("Male selected");
                else if(r2.isSelected()) l.setText("Female selected");
            }
        });

        f.add(r1); f.add(r2); f.add(b); f.add(l);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}