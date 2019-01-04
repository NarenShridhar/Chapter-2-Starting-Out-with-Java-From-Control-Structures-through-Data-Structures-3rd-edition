import java.util.Scanner;

public class Chapter2Problem18
{
	public static void main (String[] args)
	{
		String userName;
		String userAge;
		String cityName;
		String collegeName;
		String professionName;
		String animalType;
		String petName;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your name?");
		userName = keyboard.nextLine();

		System.out.println("What is your age?");
		userAge = keyboard.nextLine();

		System.out.println("What city do you live in?");
		cityName = keyboard.nextLine();

		System.out.println("What college do you attend?");
		collegeName = keyboard.nextLine();

		System.out.println("What is your profession?");
		professionName = keyboard.nextLine();

		System.out.println("What is type of animal is your pet?");
		animalType = keyboard.nextLine();

		System.out.println("What is your pet's name?");
		petName = keyboard.nextLine();

		System.out.println("There was once a person named " + userName + " who lived in " + cityName + ". At the age of " + userAge + ", " + userName 
			+ " went to college at " + collegeName + ". " + userName + " graduated and went to work as a " + professionName + ". Then, " + userName +
			" adopted a(n) " + animalType + " named " + petName + ". They both lived happily ever after!");
	}
}