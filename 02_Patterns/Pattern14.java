import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print the table : ");

        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }

        sc.close();

    }
}