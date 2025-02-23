//2. Write a program to compute the factorial of the number 10. 

import java.util.Scanner;
class Factorial{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number : ");
      int num = sc.nextInt();
      
      long factorial = 1;
      
      for(int i=1;i<=num;i++){
          factorial=factorial * i;
      }

      System.out.println("Factorial of " + num + "is" + factorial);
}}