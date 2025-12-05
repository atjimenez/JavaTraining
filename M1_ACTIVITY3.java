package M1_ACTIVITY3;

import java.util.Scanner;

public class M1_ACTIVITY3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter first integer: ");
	    int firstInt = Integer.parseInt(scanner.nextLine());
	    
	    System.out.print("Enter second integer: ");
	    int secondInt = Integer.parseInt(scanner.nextLine());
	    
	    System.out.println("Sum: " + SumOfNumbers(firstInt,secondInt));
	    System.out.println("Difference: " + DifferenceOfNumbers(firstInt,secondInt));
	    System.out.println("Product: " + ProductOfNumbers(firstInt,secondInt));
	    
	    scanner.close();
	}
	
	public static int SumOfNumbers(int a, int b)
	{
		return (a + b);
	}
	
	public static int DifferenceOfNumbers(int a, int b)
	{
		return (a - b);
	}
	
	public static int ProductOfNumbers(int a, int b)
	{
		return (a * b);
	}
}
