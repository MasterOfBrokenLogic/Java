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

class jlabeldemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");

        JLabel label = new JLabel("Hello Swing");

        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}