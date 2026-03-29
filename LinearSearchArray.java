import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        int n, key, found = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = 1;
                break;
            }
        }

        if(found == 0) {
            System.out.println("Element not found");
        }
    }
}
