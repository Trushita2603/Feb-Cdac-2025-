public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 0;  // Initialized count before use
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}
