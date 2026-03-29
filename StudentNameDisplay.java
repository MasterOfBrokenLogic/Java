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

public class StudentNameDisplay {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student");

        JLabel l = new JLabel("Enter Name:");
        l.setBounds(50, 50, 100, 30);

        JTextField t = new JTextField();
        t.setBounds(150, 50, 100, 30);

        JButton b = new JButton("Show");
        b.setBounds(100, 100, 80, 30);

        JLabel result = new JLabel();
        result.setBounds(50, 150, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText("Name: " + t.getText());
            }
        });

        f.add(l); f.add(t); f.add(b); f.add(result);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
