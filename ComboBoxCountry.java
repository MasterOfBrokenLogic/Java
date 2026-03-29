/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import javax.swing.*;

public class ComboBoxCountry {
    public static void main(String[] args) {
        JFrame f = new JFrame("Country");

        String countries[] = {"India", "USA", "UK", "Canada"};

        JComboBox cb = new JComboBox(countries);
        cb.setBounds(50, 50, 120, 30);

        f.add(cb);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}