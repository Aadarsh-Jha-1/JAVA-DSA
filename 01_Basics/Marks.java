import java.util.Scanner;

public class Marks{
    public static void main(String[] args){

        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for marks input
        System.out.println("Enter Marks:");
        int marks = sc.nextInt();
        
        // Check the marks and print corresponding output
        if(marks > 90) {
            System.out.println("Excellent");
        } else if(marks > 80 && marks <= 90) {
            System.out.println("Good");
        }
        else if(marks > 70 && marks <= 80) {
            System.out.println("Fair");
        }
        else if(marks > 60 && marks <= 70) {
            System.out.println("Meets Expectations");
        }
        else if(marks <= 60) {
            System.out.println("Below Par");
        }

        // Close the Scanner to free up resources
        sc.close();
    }
}
