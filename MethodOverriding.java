/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
class Parent {
    void show() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
