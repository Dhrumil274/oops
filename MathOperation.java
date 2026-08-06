import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.println("Results:");
        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division = " + (num1 / num2));
            System.out.println("Modulus = " + (num1 % num2));
        } else {
            System.out.println("Division = Not possible ");
            System.out.println("Modulus = Not possible ");
        }

        sc.close();
    }
}