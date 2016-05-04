package dragonGame;
import java.util.*;
public class AdventureGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
System.out.println("Welcome to the Enchanted Adventure!");
System.out.println("What is your name?:");
String name = scan.nextLine();
System.out.println("Would your like to play a game?(y/n):");
String play = scan.nextLine();
int gameOn = 1;
while (play.equalsIgnoreCase("y") ){
	switch (gameOn){
	case 1:
		System.out.println("Excellent! You are walking across a field and you encounter"
				+ " a fire-breathing dragon!");
				System.out.println ("What would you do? Enter 'fb' or 'ra':");
		String escape = scan.nextLine();
		if (escape.equalsIgnoreCase("fb")){
				gameOn=2;}
		else
			{System.out.println("You ran away but not fast enough. You"
					+ " were caught and eaten alive by the dragon!");
		play = "n";}
	break;
	case 2: 
		System.out.println("You approach the dragon. You see that he has ____ heads");
		System.out.println("Enter '1' or '2' or '3':");
		int heads = scan.nextInt();
		if (heads==3){
			gameOn = 3;}
		else{
			System.out.println("You were rescued by the town butcher. He lured the dragon away from you with a steak!");
	play = "n";}
			break;	
	case 3: 
		System.out.println("No one has ever faced a three headed dradon before! Choose your weapon!");
		System.out.println("Enter 'slingshot' or 'sword':");
		String weapon = scan.nextLine();
		if (weapon.equalsIgnoreCase("slingshot")){
			gameOn=4;}
		else {
			System.out.println("The dragon ate you and used your sword as a toothpick!");
			play = "n";
			break;
		}
	case 4: 
		System.out.println("Armed with your slingshot you approach the dragon. You can feel its fiery breath as you get closer.");
		System.out.println("It stares at you with its ____ eyes.(Enter 'red' or 'blue':)");
		String eyes = scan.nextLine();
		if (eyes.equalsIgnoreCase("red")){
			gameOn=5;}
		else {
			System.out.println("It turns out that blue-eyed dragons are friendly! You're safe to go on with your day!");
			play = "n";
			break;
		}
	
	}
}
System.out.println("Thanks for playing "+name+"! See ya soon!");
	}

}
