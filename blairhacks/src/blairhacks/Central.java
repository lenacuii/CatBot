package blairhacks;

import java.util.Scanner;

public class Central {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to CatBot!");
		System.out.println("There are three CatBots that you can talk to.");
		System.out.println("Lilly is here to chat to help you feel positive.");
		System.out.println("Nyan is here to feed you memes.");
		System.out.println("And Selene doesn't know that she's a bot, but she's trying her best...");
		System.out.println("You can also talk to a normal cat.");
		System.out.println("Enter L for Lilly, N for Nyan, S for Selene, C for a normal cat, or q to quit:");
		boolean loop = true;
		String response = "";
		while (loop) {
			response = scanner.nextLine();
			boolean validated = true;
			Cat c;
			switch (response.toLowerCase()) {
				case "l":
					c = new Lilly();
					break;
				case "n":
					c = new Nyan();
					break;
				case "s":
					c = new Selene();
					break;
					
				case "c":
					c = new Cat();
					break;
				case "q":
					c = null;
					loop = false;
					break;
					
				case "t":
					c = new Tmdl();
					break;
					
				case "lilly":
					c = new Lilly();
					break;
				case "nyan":
					c = new Nyan();
					break;
				case "selene":
					c = new Selene();
					break;
				case "cat":
					c = new Cat();
					break;
				case "quit":
					c = null;
					loop = false;
					break;
				case "goodbye":
					c = null;
					loop = false;
					break;
				case "bye":
					c = null;
					loop = false;
					break;
				case "end":
					c = null;
					loop = false;
					break;
				case "tmdl":
					c = new Cat();
					System.out.println("Protect the ecosystem from TMDL guys!");
					break;
				default:
					validated = false;
					c = null;
					System.out.println("Please enter the name or initial of one of our four CatBots.");
					break;			
			}
			
			if (loop) {
				if (validated) {
					c.launch();
					System.out.println("Thanks for interacting with one of our CatBots!");
					System.out.println("You can interact with another CatBot or quit the program.");
				}
				
				System.out.println("Enter L for Lilly, N for Nyan, S for Selene, C for a cat, or Q to quit:");
			}
			
		}
		
		System.out.println("Thanks for chatting with the CatBots!");
		System.out.println("Have a lovely day!");
	}

}