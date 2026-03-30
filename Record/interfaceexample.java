/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
interface sample {
    void show();
}

class interfaceexample implements sample {
    public void show() {
        System.out.println("Interface method implemented");
    }

    public static void main(String[] args) {
        interfaceexample obj = new interfaceexample();
        obj.show();
    }
}