import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
  
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter a number to define numbers of rows to print stars : ");

        int n = sc.nextInt();

        int count = 1;

        System.out.println("The Output Is : ");

        for(int i=1; i<=n; i++){

            
            int j =1;

            while(j<=i){
                System.out.print(count+"\t");
                j++;

                count++;

            }

            System.out.println();

        }

        sc.close();


    }
}