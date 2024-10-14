import java.util.Scanner;

public class Prime_Numbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Inputs You Want To Give");

        int numOfInputs= sc.nextInt();
        int[] numbers = new int[numOfInputs];

        int count =0;

        System.out.println("Enter " + numOfInputs + " integers:");

        for (int i=0;i<numOfInputs;i++){
            numbers[i]=sc.nextInt();
        }

        for(int j=0;j<numbers.length;j++){
            count=0;
            for(int k=1; k<=Math.sqrt(numbers[j]);k++){
                if(numbers[j]%k == 0 ){
                    count++;
                }
                
            }
            if(count>1){System.out.println(numbers[j]+" is not prime");}
                else{System.out.println(numbers[j]+" is prime");}
        }
        sc.close();

    }

    
}