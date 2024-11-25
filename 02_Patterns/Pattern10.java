import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the cross pattern (must be odd):");
        int n = sc.nextInt();

        // Check if the number of rows is odd
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number to form a proper cross pattern.");
            
        }

        int sp = n / 2;  // spaces before the first star
        
        // Top half of the pattern
        for (int i = 1; i <= n / 2 + 1; i++) {
            // Print leading spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // Print the first star
            System.out.print("*\t");

            // Print spaces between stars
            if (i != 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("\t");
                }
                // Print the second star (only after the first row)
                System.out.print("*\t");
            }

            System.out.println();  // Move to the next line
            sp--;   // Decrease spaces before stars
        }

        // Bottom half of the pattern (mirror of the top half)
        sp = 1;  // starting space for the bottom half
        for (int i = 1; i <= n / 2; i++) {
            // Print leading spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // Print the first star
            System.out.print("*\t");

            // Print spaces between stars
            for (int j = 1; j <= n - 2 * (i + 1); j++) {
                System.out.print("\t");
            }

            // Print the second star (only for rows after the first)
            if (i != n / 2) {
                System.out.print("*\t");
            }

            System.out.println();  // Move to the next line
            sp++;   // Increase spaces before stars
        }

        sc.close();
    }
}
