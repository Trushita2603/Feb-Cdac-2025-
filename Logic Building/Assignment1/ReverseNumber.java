//Write a Java program that takes a number as input and prints the reverse of that number. 
//Test Data: 
//Input number: 12345 
//Expected Output: 
//The reverse of 12345 is 54321.

class ReverseNumber{
  public static void main(String args[]){
    int n = 12345;
    int rev = 0;
    while(n!=0){
    int r=n%10;
    rev=(rev*10)+r;
    n=n/10;
  }
  System.out.println(rev);
}
}