/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
import java.util.Scanner;

public class MatrixLargestSmallest {
    public static void main(String[] args) {
        int r, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int largest = arr[0][0];
        int smallest = arr[0][0];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(arr[i][j] > largest) {
                    largest = arr[i][j];
                }
                if(arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}
