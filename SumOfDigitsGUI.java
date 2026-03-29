/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import javax.swing.*;
import java.awt.event.*;

public class SumOfDigitsGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Sum of Digits");

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 100, 100, 30);

        JButton b = new JButton("Find");
        b.setBounds(50, 150, 100, 30);

        b.addActionListener(e -> {
            int num = Integer.parseInt(t1.getText());
            int sum = 0;

            while(num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            t2.setText(String.valueOf(sum));
        });

        f.add(t1); f.add(t2); f.add(b);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
