public class OffByOneFixed { 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { // Change <= to <
            System.out.println(i); 
        } 
    } 
}
