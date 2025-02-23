//20. Count the Number of Digits in a Number 
//Write a Java program that counts the number of digits in a given number. 
//Test Data: 
//Input number: 123456 
//Expected Output: 
//The number 123456 has 6 digits.

 
class CountDigit {
    public static void main(String[] args){
        int num = 123456;  
        int count = 0;

        while (num != 0) { 
            num = num / 10;  
            count++;         
        }

        System.out.println("Number of digits: " + count);
    }
}