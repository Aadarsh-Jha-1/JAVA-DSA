import java.util.Scanner;

public class NumberRotator {

    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter The Number To Be Rotated : ");

        int num = sc.nextInt();

        int nod = (int) Math.log10(num) + 1;

        int newNum  = num;

        System.out.println("Enter The Number Of  Rotations : ");

        int rot = sc.nextInt();

        // for rotations > num of digits

        rot = rot % nod;

        // for negative rotations

        if (rot<0){
            rot = rot + nod;
        }

        int div = (int)Math.pow(10, rot);
            
            int rem = newNum%div;

            int quo = newNum/div;

            int count = (int) Math.log10(quo) + 1;

            int newRem = rem*((int)Math.pow(10, count));

            newNum = newRem+quo;

            System.out.println("Rotated Number : "+newNum);
      
        sc.close();

    }
}