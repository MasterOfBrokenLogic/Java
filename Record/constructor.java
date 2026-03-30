/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
class constructor {
    int num;

    constructor() {
        num = 10;
    }

    void display() {
        System.out.println("Value: " + num);
    }

    public static void main(String[] args) {
        constructor obj = new constructor();
        obj.display();
    }
}