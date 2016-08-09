import java.util.Scanner;


public class Roots {
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		float num = reader.nextFloat();
		System.out.println("The square root of " + Float.toString(num) + " is " + Math.sqrt(num));
		System.out.println("The cube root of " + Float.toString(num) + " is " + Math.cbrt(num));
		
		
	}
	
}
