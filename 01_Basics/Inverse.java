import java.util.Scanner;

public class Inverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Input the number
        System.out.println("Enter a number where each digit is <= number of digits:");
        int num = sc.nextInt();
        
        // Step 2: Convert the number to a string to get the number of digits
        String numStr = Integer.toString(num);
        int n = numStr.length();  // Number of digits
        
        // Step 3: Create an array to store the inverse
        int[] inverse = new int[n];
        
        // Step 4: Process each digit
        for (int i = 0; i < n; i++) {
            int digit = numStr.charAt(i) - '0';  // Convert character to integer
            
            // Check if digit exceeds number of digits
            if (digit > n) {
                System.out.println("Invalid input! Each digit must be <= number of digits.");
                return;
            }
            
            // Place the position (i+1) at the index given by the digit
            inverse[digit - 1] = i + 1;
        }
        
        // Step 5: Print the inverse array as a number
        System.out.print("Inverse of the number is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(inverse[i]);
        }

        System.out.println();
        
        sc.close();
    }
}
