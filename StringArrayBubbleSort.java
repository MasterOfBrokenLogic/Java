/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import java.util.Scanner;

public class StringArrayBubbleSort {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];

        System.out.println("Enter strings:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted strings:");

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
