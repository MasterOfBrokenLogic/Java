/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
class paramconstructor {
    int num;

    paramconstructor(int n) {
        num = n;
    }

    void display() {
        System.out.println("Value: " + num);
    }

    public static void main(String[] args) {
        paramconstructor obj = new paramconstructor(50);
        obj.display();
    }
}