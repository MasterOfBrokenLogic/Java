import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("FlowLayout");

        f.setLayout(new FlowLayout());

        f.add(new JButton("Button 1"));
        f.add(new JButton("Button 2"));
        f.add(new JButton("Button 3"));

        f.setSize(300, 200);
        f.setVisible(true);
    }
}