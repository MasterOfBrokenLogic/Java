import java.util.Scanner;

class NegativeException extends Exception {
    NegativeException(String msg) {
        super(msg);
    }
}

public class NegativeExceptionDemo {
    public static void main(String[] args) {
        int n, num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        try {
            for(int i = 0; i < n; i++) {
                System.out.print("Enter number: ");
                num = sc.nextInt();

                if(num < 0) {
                    throw new NegativeException("Negative number not allowed");
                }
            }

            System.out.println("All numbers are positive");

        } catch(NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}
