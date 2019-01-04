import javax.swing.JOptionPane;

public class Chapter2Problem17
{
	static double cupsOfSugarPer48Cookies = 1.5;
	static double cupsOfButterPer48Cookies = 1.0;
	static double cupsOfFlourPer48Cookies = 2.75;
	static int regularBatchOfCookies = 48;
	static int userNumberOfCookies;
	static String input;
	static String output;

	public static void main (String[] args)
	{
		double expectedCupsOfSugar;
		double expectedCupsOfButter;
		double expectedCupsOfFlour;

		input = JOptionPane.showInputDialog("How many cookies do you want to make?");
		userNumberOfCookies = Integer.parseInt(input);

		JOptionPane.showMessageDialog(null, "To produce " + userNumberOfCookies + " cookies, you will need " +
		((userNumberOfCookies/regularBatchOfCookies) * cupsOfSugarPer48Cookies) + " cups of Sugar, " 
		+ ((userNumberOfCookies/regularBatchOfCookies) * cupsOfButterPer48Cookies) + " cups of Butter, and " + 
		((userNumberOfCookies/regularBatchOfCookies) * cupsOfFlourPer48Cookies) + " cups of Flour");


	}
}