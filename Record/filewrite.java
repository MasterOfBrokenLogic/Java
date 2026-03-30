/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
import java.io.FileWriter;
import java.io.IOException;

class filewrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello, this is file writing example");
            fw.close();

            System.out.println("Data written to file successfully");
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}