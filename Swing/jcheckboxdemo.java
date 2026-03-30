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

class jcheckboxdemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");

        JCheckBox cb = new JCheckBox("Accept Terms");
        frame.add(cb);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}