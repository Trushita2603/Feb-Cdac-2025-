//13. Write a program to print the following pattern: 
/*
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 */

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print(i); 
                if (j < i) {
                    System.out.print("*"); 
                }
            }
            System.out.println(); 
        }

        for (int i = n; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print(i); 
                if (j < i) {
                    System.out.print("*"); 
                }
            }
            System.out.println(); 
        }
    }
}
