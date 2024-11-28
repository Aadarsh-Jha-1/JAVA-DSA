import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {
  
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter a number to define numbers of rows to print stars : ");

        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            int IcJ = 1; //(Combination of permutation and combination)

           for(int j=0;j<=i;j++){

            
                System.out.print(IcJ+"\t");

                int IcJp1 = (IcJ*(i-j))/(j+1);

                IcJ = IcJp1;
            
           }

            System.out.println();

        }

        sc.close();


    }
}
