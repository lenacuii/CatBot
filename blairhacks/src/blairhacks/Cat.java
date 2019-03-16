package blairhacks; import java.util.Random; import java.util.Scanner;

public class Cat { double CHANCE_OF_BLINK = .15; double CHANCE_OF_YAWN = .2; double CHANCE_OF_MEOW = .3; double CHANCE_OF_MREOW = .4; double CHANCE_OF_SLOW_MEOW = .5; double CHANCE_OF_MEW = .63; double CHANCE_OF_QUESTION = .75; double CHANCE_OF_PURR = .85; double CHANCE_OF_HEAD_TURN = .9; double CHANCE_OF_TAIL_TWITCH = .97; double CHANCE_OF_SNEEZE = 1;

Scanner scanner;
Random rand;
String name;
static String[] nameList = {"Whiskers", "Mittens", "Oliver", "Olivia", "Princess", "Clarence", "Button", "Tiger", "Pinball", "Priscilla", "Napoleon", "Tom", "Garfield", "Hamilton"};

public Cat() {
	rand = new Random();
	scanner = new Scanner(System.in);
	name = nameList[rand.nextInt(nameList.length)];
}

public void launch() {
	System.out.println("Meow meow mew meow");
	System.out.println("Translation: Hello there! I'm " + name + " the CatBot.");
	System.out.println("You can say whatever you want to me.");
	System.out.println("If you want to quit to the main menu, just type quit or q.");
	System.out.println("Say hello: ");
	String response = scanner.nextLine();
	while ((!response.toLowerCase().equals("q")) && (!response.toLowerCase().equals("quit")) && (!response.toLowerCase().equals("bye")) && (!response.toLowerCase().equals("bye!")) && (!response.toLowerCase().equals("goodbye")) && (!response.toLowerCase().equals("goodbye!"))) {
		respond(response);
		response = scanner.nextLine();
	}
	System.out.println("Meow! Bye!");
}

public void respond(String in) {
	in = in.toLowerCase();
	if (in.contains(name.toLowerCase())) {
		System.out.println("*perks ears* Mew?");
	} else if (in.contains("good kitty") || in.contains("pretty kitty")) {
		System.out.println("purrrrrr!");
	} else if (in.contains("pet")) {
		double randoNumero = rand.nextDouble();
		if (randoNumero > .5) {
			System.out.println("*rolls over for a belly rub*");
		} else {
			System.out.println("*puts head down so you can scratch their ears*");
		}
	} else if (in.equals("mew")) {
		System.out.println("Mew?");
	} else if (in.contains("mew!")) {
		System.out.println("Mew!!");
	} else if (in.equals("mew?")) {
		System.out.println("Mew!");
	} else if (in.contains("blinks")) {
		System.out.print("*blinks once*");
	} else if (in.contains("stares")) {
		System.out.print("*stares back*");
	} else if (in.contains("feed") || in.contains("food")) {
		System.out.println("*sits upright and alert*");
	} else if (in.contains("hi") || in.contains("hello")) {
		System.out.println("Mrrrrrrow");
	} else if (in.contains("meow")) {
		System.out.println("Meow!");
	} else if (in.contains("bless you")) {
		System.out.println("*sneezes emphatically* Choo!!");
	} else if (in.contains("dog")) {
		System.out.println("*jumps 3 feet in the air and then runs under a chair*");
		System.out.println("MEEEOOOOOOOW!!!");
	} else if (in.equals("no u") || in.equals("no you")) {
		System.out.println("*raises an eyebrow*");
	} else if (in.contains("yoga") || in.contains("exercise") || in.contains("stretch") || in.contains("run")) {
		System.out.println("*stretches then lies back down*");
	}
	else if (in.contains("you")) {
		System.out.println("*curls up in your lap*");
	}
	
	else {
		double randoNumero = rand.nextDouble();
		if (randoNumero < CHANCE_OF_BLINK) {
			System.out.println("*blinks slowly*");
		} else if (randoNumero < CHANCE_OF_YAWN) {
			System.out.println("*yawns*");
		} else if (randoNumero < CHANCE_OF_MEOW) {
			System.out.println("Meow...");
		} else if (randoNumero < CHANCE_OF_MREOW) {
			System.out.println("Mreow?");
		} else if (randoNumero < CHANCE_OF_SLOW_MEOW) {
			System.out.println("Meeeoooooww!");
		} else if (randoNumero < CHANCE_OF_MEW) {
			System.out.println("Mew!");
		} else if (randoNumero < CHANCE_OF_QUESTION) {
			System.out.println("Mew?");
		} else if (randoNumero < CHANCE_OF_PURR){
			System.out.println("prrrrrrrr");
		} else if (randoNumero < CHANCE_OF_HEAD_TURN) {
			System.out.println("*turns head to one side*");
		} else if (randoNumero < CHANCE_OF_TAIL_TWITCH) {
			System.out.println("*tail twitches*");
		} else if (randoNumero < CHANCE_OF_SNEEZE) {
			System.out.println("*sneezes* Choo!");
		}
	}
}
}