//9. Write a program to find and print the largest digit in the number 4825. 

public class LargestDigit {
    public static void main(String[] args) {
        int number = 4825;
        int maxDigit = 0;

        while (number > 0) {
            int digit = number % 10; 
            if (digit > maxDigit) {
                maxDigit = digit; 
            }
            number /= 10; 
        }

        System.out.println("Largest digit: " + maxDigit);
    }
}
