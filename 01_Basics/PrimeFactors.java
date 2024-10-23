import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number : ");
        int num = sc.nextInt();

        System.out.println("Prime Factors of " + num + " are : ");
        
        // Start with the smallest prime factor, which is 2
        for (int i = 2; i <= num; i++) {
            // Check if i is a factor of num
            while (num % i == 0) {
                System.out.println(i + " ");
                num = num / i; // Reduce num by the prime factor
            }
        }

        sc.close();
    }
}
