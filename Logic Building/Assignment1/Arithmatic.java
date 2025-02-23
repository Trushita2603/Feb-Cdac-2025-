//Write a Java program to print the sum, multiplication, subtraction, division, and remainder of two numbers. 
//Test Data: 
//Input first number: 125 
//Input second number: 24 
//Expected Output: 
//125 + 24 = 149 
//125 - 24 = 101 
//125 x 24 = 3000
//125 / 24 = 5 
//125 mod 24 = 5

import java.util.Scanner;
class Arithmatic{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Input first number: ");
    int num1 = input.nextInt();
    System.out.print("Input second number: ");
    int num2 = input.nextInt();

    int sum = num1 + num2;
    int sub = num1 - num2;
    int multi = num1 * num2;
    int div = num1 / num2;
    int mod = num1 % num2;


   System.out.println("Addition: "+ sum);
System.out.println("Substraction: "+ sub);
System.out.println("Multiplication: "+ multi);
System.out.println("Division: "+ div);
System.out.println("Modulus: "+ mod);

}
}