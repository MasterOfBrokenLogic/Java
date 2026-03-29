import java.util.Scanner;

public class EvenOddDigitCount {
    public static void main(String[] args) {
        int n, rem, even = 0, odd = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n > 0) {
            rem = n % 10;

            if(rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            n = n / 10;
        }

        System.out.println("Even digits = " + even);
        System.out.println("Odd digits = " + odd);
    }
}
