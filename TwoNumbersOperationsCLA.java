public class TwoNumbersOperationsCLA {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
    }
}
