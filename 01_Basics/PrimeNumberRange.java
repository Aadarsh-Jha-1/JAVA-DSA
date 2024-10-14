import java.util.Scanner;

public class PrimeNumberRange {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Initial Number : ");

        int initialNum = sc.nextInt();
        
        System.out.println("Enter The Final Number : ");
        
        int finalNum = sc.nextInt();
        
        int count =0;

        if(initialNum>finalNum){
            System.out.println("Initial Number Can Not Be Greater Than Final Number.");
        }

        else{

        System.out.println("List Of Prime Numbers Between "+initialNum+" and "+finalNum+ " : ");

        for(int j=initialNum;j<=finalNum;j++){
            count=0;
            for(int k=1; k<=Math.sqrt(j);k++){
                if(j%k == 0 ){
                    count++;
                }
                
            }
            if(count<=1){System.out.println(j);}
        }}
        sc.close();

    }

    
}