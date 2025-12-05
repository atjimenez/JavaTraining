package M1_ACTIVITY2;

import java.util.Scanner;

public class M1_ACTIVITY2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("What is your name? ");
	    String name = scanner.nextLine();
	    System.out.println("Hello, " + name + "!");
	    scanner.close();
	}

}
