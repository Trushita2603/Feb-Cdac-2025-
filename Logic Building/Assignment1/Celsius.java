//18. Convert Celsius to Fahrenheit 
//Write a Java program to convert a temperature from //Celsius to Fahrenheit. 
//Test Data: 
//Input temperature in Celsius: 25 
//Formula: Fahrenheit = (Celsius * 9/5) + 32 
//Expected Output: 
//25°C is equal to 77.0°F


class Celsius { 
	public static void main(String[] args) 
	{ 
		// initialising 
		double celsius = 25, fahrenheit = 0.0; 
		
		// formula for conversion 
		fahrenheit = (celsius * 9/5) + 32; 
		System.out.println( 
			" value of temperature in fahrenheit:"
			+ fahrenheit); 
	} 
}
