package blairhacks;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lilly extends Cat { 
	static String[] assurances = {"I hear you.", "Thanks for telling me.", "I'm glad you decided to tell me that.", 
			"I get what you mean.", "I value that you're telling me this.", "It's really good that "
					+ "you're talking about this.", "Go on.", "I'm listening.", "Please continue.", "It's good"
							+ " that we're discussing this.", "Talking about your emotions can really help you."};
	String diary = ""; 
	ArrayList<String> assurUsable;
	public Lilly() {
		super();
		name = "Lilly";
		reloadList("");
	}
	
	//override
	public void launch() {
		System.out.println("Hello there! I'm Lilly the Positive CatBot.");
		System.out.println("I'm here to talk to you and make sure you're feeling okay.");
		System.out.println("If you want to quit to the main menu, just type quit or q.");
		System.out.println("How are you feeling right now? ");
		String response = scanner.nextLine().toLowerCase();
		String feeling = response; 
		diary += "How I felt: "+response + "\n"; 
		if (response.contains("not too good") || response.contains("not good") || response.contains("not very good")
				|| response.contains("not too well") || response.contains("not very well") || 
				response.equals("bad") || response.contains("tide")) {
			System.out.println("I'm sorry to hear that! Hopefully, talking about how your emotions can help you feel better.");	
		}
		System.out.println("Can you explain why you feel that way?");
		response = scanner.nextLine().toLowerCase();
		diary += "Why I was "+feeling+": "+response; 
		while (!response.equals("q") && !response.equals("quit") && !response.equals("no") && !response.equals("continue")) {
			this.respond(response);
			System.out.println("Can you tell me more?");
			System.out.println("Type \'no\' if you'd rather not talk about it.");
			System.out.println("Type \'continue\' if we're done with this line of conversation.");
			System.out.println("Or just tell me more about what you said previously, or whatever's on your mind.");
			response = scanner.nextLine().toLowerCase();
			if(!response.equalsIgnoreCase("q")&&!response.equalsIgnoreCase("quit")&&!response.equalsIgnoreCase("no")&&
					!response.equalsIgnoreCase("continue")) {
				diary += "\n" + response; 
			}
		}
		
		if (response.equals("continue")) {
			System.out.println("You also should talk to a real person about this sort of thing from time to time.");
			response = ""; 
		} else if (response.equals("no")) {
			System.out.println("I understand. If you can talk, you should, but if you can't, then don't push yourself.");
			try{
				day();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("Thanks for talking to me.");
		System.out.println("Talking out your emotions can help you feel better, so I recommend you come "
				+ "back and talk to me every now and then.");
		System.out.println("Better yet, reach out and talk to someone you know.");
		System.out.println("Would you like to record this in your diary? (y/n): ");
		response = scanner.nextLine();
		if(response.equalsIgnoreCase("Y")) {
			try{
				writeDiary();
			}catch(IOException e) {
				System.out.println(e);
			}			
		}
	}
	
	public void respond(String response) {
		int randGen = rand.nextInt(assurUsable.size());
		System.out.println(assurUsable.get(randGen));
		assurUsable.remove(randGen);
		if (assurUsable.size() == 1) {
			reloadList(assurUsable.get(0));
		}
	}
	
	public void reloadList(String leaveOut) {
		assurUsable = new ArrayList<String>();
		for (int i=0; i<assurances.length; i++) {
			if (!assurances[i].equals(leaveOut)) {
				assurUsable.add(assurances[i]);
			}
		}
	}
	
	public void writeDiary() throws IOException {
		Scanner s = new Scanner(new File("Diary.txt"));
		BufferedWriter w = new BufferedWriter(new FileWriter("Diary.txt")); 
		String old = ""; 
		while(s.hasNextLine()) {
			old += s.nextLine()+"\n";
		}
		w.write(old+"\n"); 
		MyCalendar cal = new MyCalendar(16,03,2019); 
		String str = cal.toString(); 
		w.write("\n"+ str + "\n");
		w.write(diary);
		w.close(); 
	}
	
	public void day() throws IOException {
		System.out.println("Can you tell me how your day went?");
		System.out.println("(Remember, you can say no or continue at any time to drop the subject, "
				+ "and you can type q or quit to return to the main menu.");
		String response = scanner.nextLine().toLowerCase();
		if(!response.equalsIgnoreCase("q")&&!response.equalsIgnoreCase("quit")) {
			diary += "\n"+"How did my day go? "+ response+"\n";
		}

		while (!response.equals("q") && !response.equals("quit") && !response.equals("no") && !response.equals("continue")) {
			this.respond(response);
			System.out.println("Can you tell me more?");
			System.out.println("Type no if you'd rather not talk about it.");
			System.out.println("Type continue if we're done with this line of conversation.");
			System.out.println("Or just tell me more about what you said, or whatever's on your mind.");
			response = scanner.nextLine().toLowerCase();
		}
		if (response.equals("q") || response.equals("quit")) {
			System.out.println("Thanks for talking to me.");
			System.out.println("Talking out your emotions can help you feel better, so I recommend you come back and "
					+ "talk to me every now and then.");
			System.out.println("Better yet, reach out and talk to someone you know.");
			System.out.println("Would you like to record this in your diary? (y/n): ");
			response = scanner.nextLine();
			if(response.equalsIgnoreCase("Y")) {
				writeDiary(); 
				
			}
		}
	}

}