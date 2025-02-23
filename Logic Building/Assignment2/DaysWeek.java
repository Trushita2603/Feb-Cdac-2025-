//Question 2: Days of the Week  
//Write a program that uses a nested switch statement to print out the day of the week based on an 
//integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it is a weekday or weekend.


import java.util.Scanner;

public class NestedSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the day of the week: ");
        int day = scanner.nextInt();
        scanner.close();

        switch (day) {
            case 1:
                System.out.print("Monday - ");
                break;
            case 2:
                System.out.print("Tuesday - ");
                break;
            case 3:
                System.out.print("Wednesday - ");
                break;
            case 4:
                System.out.print("Thursday - ");
                break;
            case 5:
                System.out.print("Friday - ");
                break;
            case 6:
                System.out.print("Saturday - ");
                break;
            case 7:
                System.out.print("Sunday - ");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                return; 
        }
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
        }
    }
}
