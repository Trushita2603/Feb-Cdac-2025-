//Question 4: Discount Calculation  
//Write a program to calculate the discount based on the total purchase amount. Use the following criteria: 
//If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
//If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
//If the total purchase is less than Rs.500, apply a 5% discount. 
//Additionally, if the user has a membership card, increase the discount by 5%. 


import java.util.Scanner;

public class DiscountCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total purchase amount (Rs.): ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next().toLowerCase();

        double discount = 0;

        if (totalAmount >= 1000) {
            discount = 20;
        } else if (totalAmount >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }
        if (membership.equals("yes")) {
            discount += 5;
        }
        double discountAmount = (totalAmount * discount) / 100;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Final amount to pay: Rs." + finalAmount);
    }
}
