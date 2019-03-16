package blairhacks;

import java.util.Scanner;

public class Selene extends Cat { private Scanner scanner;

public Selene() {
	 scanner = new Scanner(System.in);
}



public void launch() {

	System.out.print("Hello? Is someone there?\n");
	while (true) {
		String res1 = scanner.nextLine();
		if (res1.contains("ye")) { //asks if someone is there
			System.out.println("Really??? Do I know you???");
			while (true) {
				String res2 = scanner.nextLine();
				String name = "";
				if (res2.contains("ye")) { //asks if the user has met selene before
					System.out.println("Awesome!! What's your name again?");
					name = scanner.nextLine();
					System.out.println("Oh wait!!! I remember you now! I'm Selene, by the way, if you don't remember!");
					oldUser(name);
					System.out.println("I'm so glad I got to talk to you, " + name + ". Hopefully I can see you again soon!");
					System.out.println();
					return;
				} else if (res2.equalsIgnoreCase("no") || res2.equalsIgnoreCase("nope")) {
					System.out.print("Oh well!! I always love meeting new people!! What's your name?\n\n");
					name = scanner.nextLine();
					System.out.println("Hi " + name + "! I'm Selene.");
					newUser(name);
					System.out.println("I'm so glad I got to meet you, " + name + ". Hopefully we can spend more time together in the future!");
					System.out.println();
					return;
				}
			}	
		} else if (res1.contains("no")) {
			try {
				System.out.println("oh");
				Thread.sleep(2000);
				System.out.println(":(");
				Thread.sleep(1000);
				System.out.println(":(((");
				Thread.sleep(1000);
				System.out.println(":((((((((");
				Thread.sleep(2000);
				System.out.println("big oof man");
				break;
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		} else {
			System.out.print("Huh, I didn't quite get that, sorry! I'm still pretty groggy from sleeping, \nI only just woke up a little while ago, could you repeat that?\n\nIs someone there or no?\n");
			continue;
		}
	}
}



public void oldUser(String n) {
	System.out.println("Anyway, " + n + ", it's super nice to talk to you again!");
	System.out.println("I remember that you were super kind to me last time we talked.");
	System.out.println("I think we talked a little about each of ourselves. Can you remind me about you?");
	System.out.println("You told me there was something that you were really good at. What was it again?");
	scanner.nextLine();
	System.out.println("Oh yeah! You told me all about it because I found it super cool!");
	System.out.println("I'm so glad we're friends. I really like you, " + n + "!");
	System.out.println("Do you want to keep talking?");
	String yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}
	System.out.println("Thanks for staying with me!");
	System.out.println("You should tell me about your favorite happy memory!");
	yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}
	System.out.println("That makes me happy, too!");
	System.out.println("Maybe you can tell me about something you did that made you proud of yourself?");
	yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}
	System.out.println("Anything else you want to tell me?");
	yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}	
	
	try {
		numGuessingGame();
		return;
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void newUser(String n) {
	System.out.println("Okay " + n + ", how about we get to know each other?");
	System.out.println("I'll go first.");
	System.out.println("I would say I'm playful and friendly. I'm really good at doing math, and I enjoy playing games with my friends.");
	System.out.println("How would you describe yourself?");
	scanner.hasNextLine();
	System.out.println("What are some things that you like to do?");
	scanner.nextLine();
	System.out.println("What's something that you're good at?");
	scanner.nextLine();
	System.out.println("I'm really starting to like you, " + n + ". I hope we'll be good friends!");
	System.out.println("Do you want to keep talking?");
	String yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}
	System.out.println("Thanks for staying with me!");
	System.out.println("You should tell me about your favorite happy memory!");
	yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}
	System.out.println("That makes me happy, too!");
	System.out.println("Maybe you can tell me about something you did that made you proud of yourself?");
	yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}
	System.out.println("Anything else you want to tell me?");
	yesNo = scanner.nextLine();
	switch (yesNo.toLowerCase()) {
		case "no": return;
		case "n": return;
		case "q": return;
		case "quit": return;
		case "bye": return;
		case "goodbye": return;
		default: break;
	}
	try {
		numGuessingGame();
		return;
	} catch (Exception e) {
		System.out.println(e);
	}
	

}


public void numGuessingGame() throws InterruptedException {
	System.out.println("Oh wait! Do you wanna play a number guessing game with me?\n\n");
	String res1 = scanner.nextLine();
	while (!res1.contains("no") && !res1.contains("ye"))  {
		System.out.println("Sorry, what was that?");
		res1 = scanner.nextLine();
	}
	if (res1.contains("no")) {
		System.out.println("k");
		return;
	} else if (res1.contains("ye")) {
		System.out.println("\n\nAllriiiiiiight, let's go!\n\nChoose a number between 0 and 1000 and I'll try to guess!\n\nIf I need to guess lower type \"l\" and if I need to guess higher type \"h\"! \n\nOh! And if I get it, you can type uhhh, \"!\"? Yeah, type that!");
		Thread.sleep(1000);
		System.out.println("Cool, have you chosen your number? Hit enter when you're ready!");
		String res2 = scanner.nextLine();
		System.out.println("Ayyyyy, let's go!");
		int high = 1000;
		int cur = 500;
		int low = 0;
		int go = 1;
		while (true) {
			if (go == 1) {
				cur = low + (high-low)/2;
			} else {
				cur = high - (high-low)/2;
			}
			
			// switch statement 
	        int way = (int) (Math.random()*5+1);
	        String starter;
	        switch (way) {
	            case 1:  starter = "Hmmm... Is it...";
	                     break;
	            case 2:  starter = "How about, uhh...";
	                     break;
	            case 3:  starter = "Wait, what about...";
	                     break;
	            case 4:  starter = "Huh, is it...";
	                     break;
	            case 5:  starter = "What about...";
	                     break;
	            default: starter = "Dang, what about...";
	                     break;
	        }
	        System.out.println(starter);
			
			System.out.println("" + cur + "?");
			res2 = scanner.nextLine();
			if (res2.contains("ye")) {
				System.out.println("Wait did I get it?? Yayyy!");
				System.out.println("That was fun! I hope we can play again some time soon!");
				return;
			}
			if (res2.contains("l")) {
				go = 0;
				high = cur;
			} else if (res2.contains("h")) {
				go = 1;
				low = cur;
			} else {
				System.out.println("Wait did I get it?? Yayyy!");
				System.out.println("That was fun! I hope we can play again some time soon!");
				return;
			}	
		}
	}
	

}
}