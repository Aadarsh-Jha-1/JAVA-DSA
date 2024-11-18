import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
  
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter a number to define numbers of rows to print stars : ");

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            
            int j =n;

            while(j>=i){
                System.out.print("* ");
                j--;
            }

            System.out.println();

        }

        sc.close();


    }
}