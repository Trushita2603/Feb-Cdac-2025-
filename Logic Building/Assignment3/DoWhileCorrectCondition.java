public class DoWhileCorrectCondition { 
    public static void main(String[] args) { 
        int num = 1;  // Start with a positive number
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0 && num < 5); // Set a meaningful exit condition
    } 
}
