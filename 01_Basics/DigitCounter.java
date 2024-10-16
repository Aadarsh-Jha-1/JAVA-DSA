import java.util.Scanner;

public class DigitCounter{
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A number");

        int num = sc.nextInt();

        int count = 0;

        int temp =num;

        while(temp != 0){
            
            System.out.println("Before : "+ temp);
            
            temp = temp/10;
            
            System.out.println("After : "+temp);
            
            count++;
        }

        System.out.println("Number "+num+" have "+count+" digits.");

        sc.close();

    }
}