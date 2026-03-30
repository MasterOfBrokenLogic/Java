/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
interface A {
    void displayA();
}

interface B {
    void displayB();
}

class multipleinterface implements A, B {

    public void displayA() {
        System.out.println("Interface A");
    }

    public void displayB() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        multipleinterface obj = new multipleinterface();
        obj.displayA();
        obj.displayB();
    }
}