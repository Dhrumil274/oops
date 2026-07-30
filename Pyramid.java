import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

     
        System.out.println(" Pyramid:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j =rows;j>i;j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (i); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Down Pyramid
        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = i;j<=rows;j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (i); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}