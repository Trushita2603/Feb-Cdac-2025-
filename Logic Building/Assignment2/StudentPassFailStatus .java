//Question 5: Student Pass/Fail Status with Nested Switch 
//Write a program that determines whether a student passes or fails based on their grades in three 
//subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or more subjects, print the number of subjects they failed in. 

import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = scanner.nextInt();

        int failedSubjects = 0;
        if (sub1 < 40) failedSubjects++;
        if (sub2 < 40) failedSubjects++;
        if (sub3 < 40) failedSubjects++;

        switch (failedSubjects) {
            case 0:
                System.out.println("Congratulations! You Passed.");
                break;
            case 1, 2, 3:
                System.out.println("You Failed in " + failedSubjects + " subject(s).");
                break;
        }
    }
}
