import java.util.Scanner;

public class RightTriangleCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Side(Integer) : ");

        int num1 = sc.nextInt();

        System.out.println("Enter 2nd Side(Integer) : ");

        int num2 = sc.nextInt();

        System.out.println("Enter 3rd Side(Integer) : ");

        int num3 = sc.nextInt();

        if (num1>num2&&num1>num3){

            if(((int)Math.pow(num1,2))==(((int)Math.pow(num2,2))+((int)Math.pow(num3,2)))){

                System.out.println(num2+"^2"+" + "+num3+"^2"+" = "+num1+"^2"+" forms a right angled triangle. ");

            }

            else{System.out.println("Given sides do not form a right angled traingle");}

        }

        else if (num2>num1&&num2>num3){

            if(((int)Math.pow(num2,2))==(((int)Math.pow(num1,2))+((int)Math.pow(num3,2)))){

                System.out.println(num1+"^2"+" + "+num3+"^2"+" = "+num2+"^2"+" forms a right angled triangle. ");

            }

            else{System.out.println("Given sides do not form a right angled traingle");}

        }

        else if (num3>num2&&num3>num1){

            if(((int)Math.pow(num3,2))==(((int)Math.pow(num2,2))+((int)Math.pow(num1,2)))){

                System.out.println(num1+"^2"+" + "+num2+"^2"+" = "+num3+"^2"+" forms a right angled triangle. ");

            }

            else{System.out.println("Given sides do not form a right angled traingle");}

        }

        else{System.out.println("Given sides do not form a right angled traingle");}

        sc.close();



    }
}