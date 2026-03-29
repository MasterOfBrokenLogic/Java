/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int n, sum = 0, rem;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}