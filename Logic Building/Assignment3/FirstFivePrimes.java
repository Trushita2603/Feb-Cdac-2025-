//6. Write a program to find and print the first 5 prime numbers. 


public class FirstFivePrimes {
    public static void main(String[] args) {
        int count = 0; 
        int num = 2;   

        System.out.println("First 5 prime numbers:");

        while (count < 5) {
            if (isPrime(num)) { 
                System.out.print(num + " ");
                count++; 
            }
            num++; 
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

