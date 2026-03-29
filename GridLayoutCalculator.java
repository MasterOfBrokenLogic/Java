/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import javax.swing.*;
import java.awt.*;

public class GridLayoutCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        f.setLayout(new GridLayout(4, 4));

        String buttons[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","+","=","C"
        };

        for(int i = 0; i < buttons.length; i++) {
            f.add(new JButton(buttons[i]));
        }

        f.setSize(300, 300);
        f.setVisible(true);
    }
}