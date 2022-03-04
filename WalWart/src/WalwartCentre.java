import java.text.NumberFormat;
import java.util.Scanner;

public class WalwartCentre
{
	
	
	public static void payEmployee(Employee emp, double payArg) 
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double pay;
		
		System.out.println(emp);
		pay= emp.pay(payArg);
		System.out.println(money.format(pay));
	}
	public static void main(String[] args)
	{
		Manager emp1 = new Manager("Steve","Jobs", 69000);
		Associate emp2 = new Associate("Bill","Ali",14.20);
		
		Scanner input = new Scanner(System.in);
		
		String action; 
		int empNum;
		double payArg;
		
		Employee emp = emp1;
		
		do 
		{
			System.out.println("\n Employee \\ Pay \\ Quit");
			System.out.println("Enter Choice: ");
			action = input.next();
			
			if (!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter Employee Number (1, or 2): ");
				empNum = input.nextInt();
				
				switch(empNum)
				{
					case 1:emp = emp1; break;
					case 2: emp = emp2; break;
				}
				
				if (action.equalsIgnoreCase("E"))
					
				{
					System.out.println(emp);
				}
				
				else if (action.equalsIgnoreCase("P"))
				{
					System.out.println("Enter The Hours For Associate OR Pay Period For Manager");
					payArg = input.nextDouble();
					
					payEmployee(emp, payArg);
				}
				
			}
			
		}
		while (action.equalsIgnoreCase("Q"));
		{
		
	}
	}
}
