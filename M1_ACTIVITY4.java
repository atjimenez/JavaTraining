package M1_ACTIVITY4;

import java.util.Scanner;

public class M1_ACTIVITY4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter your age: ");
	    String userAge = scanner.nextLine();
	    System.out.println("Your age as int: " + Integer.parseInt(userAge));
	    System.out.println("Your age as double: " + Double.parseDouble(userAge));
	    scanner.close();
	}

}
