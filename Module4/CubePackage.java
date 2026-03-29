package mypack;

import java.util.Scanner;

public class CubePackage {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int cube = n * n * n;

        System.out.println("Cube = " + cube);
    }
}
