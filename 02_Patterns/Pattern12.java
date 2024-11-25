import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to define numbers of rows to print fibonacci sequence : ");
        int n = sc.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.println("The Output Is : ");

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Loop for each number in the row
            for (int j = 1; j <= i; j++) {
                // Print the current Fibonacci number
                System.out.print(fib1 + "\t");

                // Update the Fibonacci sequence for the next number
                int fibn = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibn;
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close();
    }
}
