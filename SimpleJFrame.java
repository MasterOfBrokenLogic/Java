/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import javax.swing.*;

public class SimpleJFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame");

        JLabel l = new JLabel("Welcome to Java Swing");
        l.setBounds(50, 50, 200, 30);

        f.add(l);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}