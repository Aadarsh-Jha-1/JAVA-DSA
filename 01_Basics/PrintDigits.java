import java.util.Scanner;

public class PrintDigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number");

        int num = sc.nextInt();

        System.out.println(" ");

        System.out.print("The Number " + num + " has the following digits (in reverse order): ");

        // Copy of num to work with during reverse order printing
        int temp = num;

        // Print digits in reverse order
        while (temp != 0) {
            int div = temp % 10;
            System.out.print(div + " ");
            temp = temp / 10;
        }

        System.out.println(" ");

        // To print digits in actual order:
        // Reset tempNum to original value of num
        int tempNum = num;

        // Calculate the number of digits
        int count = (int) Math.log10(num) + 1;

        // Use Math.pow() to get the divisor
        int divisor = (int) Math.pow(10, count - 1);

        System.out.print("The Number " + num + " has the following digits (in actual order): ");

        // Print digits in actual order
        while (divisor > 0) {
            int digit = tempNum / divisor;  // Get the leftmost digit
            System.out.print(digit + " ");
            tempNum = tempNum % divisor;    // Remove the leftmost digit
            divisor = divisor / 10;         // Reduce divisor by a factor of 10
        }

        System.out.println();

        sc.close();
    }
}
