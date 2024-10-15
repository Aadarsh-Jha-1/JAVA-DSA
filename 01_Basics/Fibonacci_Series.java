import java.util.Scanner;

public class Fibonacci_Series{

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        int fib1 =0;

        int fib2 =1;

        

        System.out.println("Range of Fibonacci Series : ");

        int range = sc.nextInt();

        System.out.println(" ");

        System.out.print("Fibonacci Series Till "+range+" : ");

        System.out.print(fib1);

        for(int i=0; i<=range;i++){
            int fibn= fib1+fib2;

            System.out.print(" "+fibn);

            fib1=fib2;
            fib2=fibn;


        }
        System.out.println(" ");

        sc.close();



    }

}