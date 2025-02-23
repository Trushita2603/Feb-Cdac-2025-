import java.util.Scanner;
class Pattern{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int rows = sc.nextInt();
       for(int i=1;i<=rows;i++)
{
       for(int j=1;j<=rows-i;j++)
{
       System.out.println(" ");
       }
       for(int k=1;k<=i;k++){
       System.out.println("* ");
}
       System.out.println();
}
}
}

