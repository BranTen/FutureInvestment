import java.util.Scanner;
//scanner for the input
public class FutureInvestment {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter the investment amount: ");
			double investmentAmount = input.nextDouble();
			System.out.println("Enter the annual intrest rate: ");
			double monthlyIntrestRate = input.nextDouble();
			System.out.println("Enter number of years as an integer: ");
			double numberOfYears = input.nextDouble();
			//gather the information from the user for each of the variables
				double futureInvestmentValue = investmentAmount * Math.pow(1 + ((monthlyIntrestRate / 100)/12), numberOfYears * 12);
				//calculate the future investment
					System.out.println("Future value for " + investmentAmount + " with interest rate of ");
					System.out.print(monthlyIntrestRate + " and " + numberOfYears + " year(s) is ");
					System.out.print(futureInvestmentValue);
					// print the value for the total investment
	}
}
