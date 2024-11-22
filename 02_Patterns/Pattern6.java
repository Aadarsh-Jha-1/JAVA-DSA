import  java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of lines of stars you want to print (only Odd Number Of Rows) : ");
        int n = sc.nextInt();

        int st = n/2;
        int sp = 1;

        for(int i = 1 ; i<=(int)((n/2)); i++){

            for(int j = 0; j<st;j++){
                System.out.print("*\t");
              }
              
          for (int j = 1; j<=sp; j++){

            System.out.print("\t");

          }

          for (int j = 1; j<=st; j++){

            System.out.print("*\t");

          }

          for(int j = 0; j<sp;j++){
            System.out.print("\t");
          }


          



          
            st--;
            sp = sp+2;
            System.out.println();

        }
          
          int st2 = 0;
          int sp2 = n;
  

        for(int i = 1; i<=(int)((n-n/2)); i++){
            for(int j = 1; j<=st2; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j<=sp2; j++){
                System.out.print("\t");
            }


            for(int j = 1; j<=st2; j++){
                System.out.print("*\t");
            }

            for(int j = 1; j<=sp2; j++){
                System.out.print("\t");
            }
           

            st2++;
            sp2 = sp2-2;
            System.out.println();

        }

        sc.close();
    }
}