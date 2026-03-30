import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 100, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);

        JPasswordField p1 = new JPasswordField();
        p1.setBounds(150, 100, 100, 30);

        JButton b = new JButton("Login");
        b.setBounds(100, 150, 80, 30);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(p1);
        f.add(b);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
