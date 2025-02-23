class LargestNumber{
  public static void main(String args[]){
   int a = 12;
   int b = 45;
   int c = 22;
  
   int largest =(a>b) ? (a>c?a:c) : (b>c?b:c);
   System.out.println(largest);
}
}