import javax.swing.*;
import java.awt.event.*;

public class FeedbackCharCount {
    public static void main(String[] args) {
        JFrame f = new JFrame("Feedback");

        JTextArea ta = new JTextArea();
        ta.setBounds(50, 50, 200, 100);

        JButton b = new JButton("Count");
        b.setBounds(100, 170, 80, 30);

        JLabel l = new JLabel();
        l.setBounds(50, 210, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Characters: " + ta.getText().length());
            }
        });

        f.add(ta); f.add(b); f.add(l);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}