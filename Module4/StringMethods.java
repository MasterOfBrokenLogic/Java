import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("Length = " + str.length());
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Lowercase = " + str.toLowerCase());
        System.out.println("Character at index 0 = " + str.charAt(0));
        System.out.println("Substring (0 to 3) = " + str.substring(0, 3));
    }
}
