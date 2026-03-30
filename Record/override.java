/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
class parent {
    void show() {
        System.out.println("This is parent class");
    }
}

class child extends parent {
    void show() {
        System.out.println("This is child class");
    }
}

class override {
    public static void main(String[] args) {
        child obj = new child();
        obj.show();
    }
}