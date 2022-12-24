package LearnJava;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {

	try (Scanner readint = new Scanner(System.in)) {
	    System.out.println("Enter a number (1-3): ");
	    int testValue = readint.nextInt();

	    switch (testValue) {
	    case 1:
		System.out.println("Entered value is: ");
		System.out.print("one");
		break;

	    case 2:
		System.out.println("Entered value is: ");
		System.out.print("Two");
		break;
	    case 3:
		System.out.println("Entered value is: ");
		System.out.print("Three");
		break;
	    default:
		System.out.print("Default");
	    }
	}

    }

}
