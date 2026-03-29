/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import javax.swing.*;

public class NullLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Null Layout");

        JButton b1 = new JButton("Button 1");
        b1.setBounds(50, 50, 100, 30);

        JButton b2 = new JButton("Button 2");
        b2.setBounds(50, 100, 100, 30);

        f.add(b1);
        f.add(b2);

        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}