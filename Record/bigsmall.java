/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.record;

/**
 *
 * @author teams
 */
import java.util.Scanner;

class bigsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int big = a[0];
        int small = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] > big)
                big = a[i];

            if (a[i] < small)
                small = a[i];
        }

        System.out.println("Biggest number: " + big);
        System.out.println("Smallest number: " + small);
    }
}