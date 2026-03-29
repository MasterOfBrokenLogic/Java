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

public class LargestNumberGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Largest Number");

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 90, 100, 30);

        JTextField t3 = new JTextField();
        t3.setBounds(50, 130, 100, 30);

        JButton b = new JButton("Find");
        b.setBounds(50, 170, 100, 30);

        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b1 = Integer.parseInt(t2.getText());

            int max = (a > b1) ? a : b1;

            t3.setText(String.valueOf(max));
        });

        f.add(t1); f.add(t2); f.add(t3); f.add(b);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}