public class Chapter2Problem19
{
	public static void main (String[] args)
	{
		final int shares = 1000;
		final double commissionRate = 0.02;
		double buyingCostPerShare = 32.87;
		double sellingCostPerShare = 33.92;
		double buyingCost = shares * buyingCostPerShare;
		double buyingComission = buyingCost * commissionRate;
		double buyingTotal = buyingCost + buyingComission;
		double sellingCost = shares * sellingCostPerShare;
		double sellingCommision = sellingCost * commissionRate;
		double sellingTotal = sellingCost - sellingCommision;
		double totalProfit = sellingTotal - buyingTotal;

		System.out.println("The amount of money Joe paid for the stock was: $" + buyingCost);
		System.out.println("The amount of comission Joe paid his broker when he bought the stock was: $" + buyingComission);
		System.out.println("The amount of money Joe sold the stock for was: $" + sellingCost);
		System.out.println("The amount of money Joe paid his broker when he sold the stock was: $" + sellingCommision);
		System.out.println("The total profit Joe made was: $" + totalProfit);
	}
}