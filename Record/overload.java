/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
class overload {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        overload obj = new overload();

        System.out.println("Sum (int): " + obj.add(5, 3));
        System.out.println("Sum (double): " + obj.add(2.5, 3.5));
    }
}