import java.util.Scanner;

/* Inverse Conditions - 

1. Position Value will be counted from right to left where leftmost is the 1st place.

2. No digit in the number can exceed the total count of digits => (digit<=count).

3. Each Digit will swap with its position value to make it inverse 
(for example : if in number 123 =>  digit '3' is at 1st place then in the invesre digit '1' will be at 3rd place);
*/

public class Inverse {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number where each digit is <= number of digits:");
       
        int num = sc.nextInt();

        int tempNum = num ;// for operational purposes
        
        int invertedNumber = 0;

        int originalPlace =1;

        while(tempNum!=0){
            
            int originalDigit = tempNum%10;

            int invertedDigit = originalPlace;

            int invertedPlace = originalDigit;

            invertedNumber = invertedNumber + (invertedDigit*((int)Math.pow(10,(invertedPlace-1))));

            tempNum = tempNum/10;

            originalPlace++;

        }
      
        System.out.println("Inverted Number : ");
       
        System.out.println(invertedNumber);
        
        sc.close();
    }
}
