import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Rows To Print : ");

        int n = sc.nextInt();

        int sp = 0;

        for (int i =1; i<=n; i++){

            for (int j = 0; j<sp; j++){
                System.out.print('\t');
            }

            System.out.print('*');

            System.out.println();

            sp++;

        }



    }
}