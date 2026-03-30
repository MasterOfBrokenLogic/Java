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

class jcomboboxdemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");

        String items[] = {"Item 1", "Item 2", "Item 3"};

        JComboBox cb = new JComboBox(items);
        frame.add(cb);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}