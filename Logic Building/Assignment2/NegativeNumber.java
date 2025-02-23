//2. Check Negative Number: 
//Task: Create a flowchart to check whether a number is negative. 
//Next Step: Write a Java program that checks if a predefined number is negative using an if-else statement and displays the result. 

import java.util.Scanner;
class NegativeNumber{
  public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num = input.nextInt();
      
if(num<=0){
   System.out.println("Number is Negative");
}
}
}