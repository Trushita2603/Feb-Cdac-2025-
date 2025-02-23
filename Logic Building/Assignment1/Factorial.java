//15. Find the Factorial of a Number 
//Write a Java program to find the factorial of a number. 
//Test Data: 
//Input a number: 5 
//Expected Output: 
//Factorial of 5 is 120.

 
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        long factorial = 1; 
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
        
        
    }
}
