import javax.swing.*;
import java.awt.*;

public class GridBagForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Form");

        f.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        g.gridx = 0; g.gridy = 0;
        f.add(new JLabel("Name:"), g);

        g.gridx = 1;
        f.add(new JTextField(10), g);

        g.gridx = 0; g.gridy = 1;
        f.add(new JLabel("Age:"), g);

        g.gridx = 1;
        f.add(new JTextField(10), g);

        g.gridx = 0; g.gridy = 2;
        f.add(new JLabel("Course:"), g);

        g.gridx = 1;
        f.add(new JTextField(10), g);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
