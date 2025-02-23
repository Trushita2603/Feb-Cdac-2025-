//7. Find the Largest of Three Numbers: 
//Task: Create a flowchart to find the largest of three numbers. 
//Next Step: Write a Java program that finds and prints the largest of three predefined numbers using if-else statements.

 
public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 25, num2 = 78, num3 = 87;
        
        int largest;
        
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        System.out.println("The largest number is: " + largest);
    }
}
