import java.util.Scanner;

public class Hcf_Lcm {

    private static int mod = 0;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        int hcf = 0; // Initialize HCF variable

        // Calculate HCF using the Euclidean algorithm
        int a = num1;
        int b = num2;

        while (b != 0) {
            mod = a % b;
            a = b;
            b = mod;
        }

        hcf = a; // After the loop, 'a' contains the HCF

        System.out.println("HCF: " + hcf);

        int lcm  = ((num1*num2)/hcf);

        System.out.println("Lcm :"+lcm);

        sc.close();
    }
}
