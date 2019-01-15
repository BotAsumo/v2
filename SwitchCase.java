package v2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int choice;

		do {
		
		System.out.println("Welcome to rapper inspiration database! Please choose a type!");
		System.out.println("(1) - Trap");
		System.out.println("(2) - lyrical");
		System.out.println("(3) - flow master");
		System.out.println("(4) - catchy beats");
		System.out.println("(5) - Quit");
		System.out.println();
		choice= input.nextInt();
		
		
		String type;
		
			
		switch (choice) {
		case 1:
			type = "Trap";
			System.out.println("You chose " + type + "! Here are some good artists!");
			System.out.println();
			System.out.println("1. Migos");
			System.out.println("2. Travis Scott");
			System.out.println("3. 21 Savage");
			System.out.println();
		
			break;
		case 2:
			type = "Lyrical";
			System.out.println("You chose " + type + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Logic");
			System.out.println("2. Joyner Lucas");
			System.out.println("3. Eminem");
			System.out.println();
			break;
		case 3:
			type = "flow master";
			System.out.println("You chose " + type + "! Here are some good artists!");
			System.out.println();
			System.out.println("1. Biggie Smalls");
			System.out.println("2. The Notorious B.I.G");
			System.out.println("3. Christopher Wallace");
			System.out.println();
			break;
		case 4:
			type = "Catchy beats";
			System.out.println("You chose " + type + "! Here are three good artists!");
			System.out.println();
			System.out.println("1. Metro Boomin");
			System.out.println("2. Tay keith");
			System.out.println("3. Murda Beatz");
			System.out.println();
			break;
		
		case 5:
			System.out.println("Thank you for today!");
			break;
			
		default:
			type = "invalid";
			System.out.println("You have made a " + type + " choice! Too bad for you!");
			System.out.println();
			break;
		}
		} while (choice != 5);
		
		input.close();
	}

}