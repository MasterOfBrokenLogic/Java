/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing;

/**
 *
 * @author teams
 */
import javax.swing.*;

class jpaneldemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");

        JPanel panel = new JPanel();
        panel.add(new JLabel("This is a panel"));

        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}