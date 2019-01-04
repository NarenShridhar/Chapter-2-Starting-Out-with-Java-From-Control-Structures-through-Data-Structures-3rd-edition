public class Chapter2Problem16
{
	final static int customersSurveyed = 12467;
	final static double energyDrinkPurchasers = customersSurveyed * 0.14;
	final static double citrusFlavoredPurchasers = energyDrinkPurchasers * 0.64;

	public static void main (String[] args)
	{
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week was: " + energyDrinkPurchasers);
		System.out.println("The approximate number of customers in the survey who prefer cirtus flavored energy drinks was: " + citrusFlavoredPurchasers);
	}
}