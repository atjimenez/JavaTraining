package Activity4TypeCasting;

import java.util.Scanner;

public class Activity4TypeCasting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter your age: ");
	    String userAge = scanner.nextLine();
	    System.out.println("Your age as int: " + Integer.parseInt(userAge));
	    System.out.println("Your age as double: " + Double.parseDouble(userAge));
	    scanner.close();
	}

}
