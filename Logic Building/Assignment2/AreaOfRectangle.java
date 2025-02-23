//6. Print Area of a Rectangle: 
//Task: Create a flowchart to calculate and print the area of a rectangle. 
//Next Step: Write a Java program that calculates the area of a rectangle using the formula area = length * width. Use predefined values for length and width.

 
class AreaOfRectangle{
    public static void main(String[] args){
        final double width = 4.5;    
        final double height = 7.9;  
        double perimeter = 2 * (height * width);   
        double area = width * height;   
        System.out.println("Perimeter is = " + perimeter);  
        System.out.println("Area is = " + area);   
    }
}