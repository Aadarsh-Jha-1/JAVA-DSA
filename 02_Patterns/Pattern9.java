import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the cross pattern (must be odd):");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number to form a proper cross pattern.");
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' when the row and column indices match (diagonal)
                // or when the column index is n-1-row index (other diagonal)
                if (i == j || j == n - 1 - i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
