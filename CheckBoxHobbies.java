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

public class CheckBoxHobbies {
    public static void main(String[] args) {
        JFrame f = new JFrame("Hobbies");

        JCheckBox c1 = new JCheckBox("Reading");
        c1.setBounds(50, 50, 100, 30);

        JCheckBox c2 = new JCheckBox("Gaming");
        c2.setBounds(50, 80, 100, 30);

        JCheckBox c3 = new JCheckBox("Music");
        c3.setBounds(50, 110, 100, 30);

        JButton b = new JButton("Show");
        b.setBounds(50, 150, 80, 30);

        JLabel l = new JLabel();
        l.setBounds(50, 190, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String msg = "";

                if(c1.isSelected()) msg += "Reading ";
                if(c2.isSelected()) msg += "Gaming ";
                if(c3.isSelected()) msg += "Music ";

                l.setText("Hobbies: " + msg);
            }
        });

        f.add(c1); f.add(c2); f.add(c3);
        f.add(b); f.add(l);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}