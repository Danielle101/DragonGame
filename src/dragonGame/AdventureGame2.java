//This is a one player game where the user faces the fiery dragon
package dragonGame;

import java.util.*;

public class AdventureGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		System.out.println("Welcome to the Enchanted Adventure!");
		while (choice.equalsIgnoreCase("y")) {

			String name = Validator.get_String("\nWhat is your name?:");

			String play = Validator.getString("Would your like to play a game?(y/n):");
			int gameOn = 1;
			while (play.equalsIgnoreCase("y")) {
				switch (gameOn) {
				case 1:
					System.out.println("\nExcellent! You are walking across a field and you encounter"
							+ " a fire-breathing dragon!");

					String escape = Validator
							.getEscape("What would you do? Face the beast of run away? Enter 'fb' or 'ra':");
					if (escape.equalsIgnoreCase("fb")) {
						gameOn = 2;
					} else {
						System.out.println("You ran away but not fast enough. You"
								+ " were caught and eaten alive by the dragon!");
						play = "n";
					}
					break;
				case 2:
					System.out.println("\nYou approach the dragon. You see that he has ____ heads.");

					String heads = Validator.getHeads("Enter 'one' or 'two' or 'three':");
					if (heads.equalsIgnoreCase("three")) {
						gameOn = 3;
					} else {
						System.out.println(
								"You were rescued by the town butcher. He lured the dragon away from you with a steak!");
						play = "n";
					}
					break;
				case 3:
					System.out.println("\nNo one has ever faced a three headed dragon before! Choose your weapon!");

					String weapon = Validator.getWeapon("Enter 'slingshot' or 'sword':");
					if (weapon.equalsIgnoreCase("slingshot")) {
						gameOn = 4;
					} else {
						System.out.println("The dragon ate you and used your sword as a toothpick!");
						play = "n";
					}
					break;

				case 4:
					System.out.println(
							"\nArmed with your slingshot you approach the dragon. You can feel its fiery breath as you get closer.");

					String eyes = Validator.getEyes("It stares at you with its ____ eyes.(Enter 'red' or 'blue':)");
					if (eyes.equalsIgnoreCase("red")) {
						gameOn = 5;
					} else {
						System.out.println(
								"It turns out that blue-eyed dragons are herbivores! You're safe to go on with your day!");
						play = "n";
					}
					break;

				case 5:
					System.out
							.println("\nOh thank goodness! Red-eyed dragons are friendly! You pet it and become friends.");
					String dragonName = Validator.get_String("You name the dragon _____.(Enter a name):");
					System.out.println(name + " and " + dragonName + " both lived happily ever after!");
					play = "n";

					break;
				}
				
			}
			choice= Validator.getString("\nPlay again?(y/n):");
		}
		System.out.println("Thanks for playing! See you soon!");
	}
	
}
