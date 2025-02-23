//3. Check Odd or Even Number: 
//Task: Create a flowchart to determine whether a number is odd or even. 
//Next Step: Write a Java program that checks if a predefined number is odd or even. Use an if-else statement and the modulus operator (%) to determine whether the number is 
//divisible by 2 or not.


import java.util.Scanner;

class OddEvenNumber{
  public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the Number");
      int num = input.nextInt();

    if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
}
}
