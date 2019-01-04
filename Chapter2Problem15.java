public class Chapter2Problem15
{
	final static int stockShares = 600;
	final static double sharePrice = 21.77;
	final static double percentComission = 0.02;
	final static double stockAlone = stockShares * sharePrice;
	final static double stockAndComission = stockAlone * percentComission;
	final static double totalAmount = stockAlone + stockAndComission;

	public static void main (String[] args)
	{
		System.out.println("The amount paid for the stock alone is: $" + stockAlone);
		System.out.println("The amount of the commission is: $" + (stockAndComission));
		System.out.println("The toal amount paid is: $" + totalAmount);
	}
}