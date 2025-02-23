//11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
//operators in a single expression 

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int result = (++x) + (y--);

        System.out.println("Value of x after pre-increment: " + x); 
        System.out.println("Value of y after post-decrement: " + y); 
        System.out.println("Result of the expression (++x) + (y--): " + result); 
    }
}
