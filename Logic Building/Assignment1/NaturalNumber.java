import java.util.Scanner;
class NaturalNumber{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the value if N: ");
int n= sc.nextInt();

System.out.println("First" + n + "natural number: ");

for(int i=1;i<=n; i++){
System.out.println(i+" ");
}
}
}