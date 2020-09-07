import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner myCal = new Scanner(System.in);
		// Ask for type of calculation
		System.out.println("Please select the type of calculation: + OR - OR / OR *");

		String calType = myCal.nextLine();
		System.out.println("Enter first number you want to use for calculation");
		// Numerical input
		int a = myCal.nextInt();
		System.out.println(a);
		System.out.println("Please enter second number");
		int b = myCal.nextInt();

		/*char Response;
		Scanner input = new Scanner(System.in);
		Response = input.next().charAt(0);
		while (true)
		{
			if (Response == 'Y' || Response == 'y')
			{*/
				// Switch cases for different calculations
				switch (calType)
				{
				case "+":
					System.out.println(a + b);
					System.out.println("Would you like to continue? Y or N");
					break;
				case "-":
					System.out.println(a - b);
					System.out.println("Would you like to continue? Y or N");
					break;
				case "*":
					System.out.println(a * b);
					System.out.println("Would you like to continue? Y or N");
					break;
				case "/":
					System.out.println(a / b);
					System.out.println("Would you like to continue? Y or N");
					break;

				}
			//}
		//}
	}

}
