/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import javax.swing.*;

public class ListLanguages {
    public static void main(String[] args) {
        JFrame f = new JFrame("Languages");

        String data[] = {"Java", "Python", "C", "C++"};

        JList list = new JList(data);
        list.setBounds(50, 50, 100, 100);

        f.add(list);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}