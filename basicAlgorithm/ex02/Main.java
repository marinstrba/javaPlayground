import java.util.Scanner;

public class Main
{

	/*
	*	My main function.
	*/
	public static void main(String[] args)
	{
		// Declaration and initialization of variables.
		int 		sum;
		int			num;
		int			numOfCoffee;
		String 		input;

		sum = 0;
		num = 0;
		numOfCoffee = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer (or an empty line to exit): ");
		
		// Main loop which checks the input and and whetever its valid
		while (true)
		{
			// Check input
			input = scanner.nextLine();
			if (input.isEmpty()) 
				break ;
			num = validInput(input);
			// Check number
			while (num != 0)
			{
				sum += (num % 10);
				num /= 10;
			}
			if (isPrime(sum))
				numOfCoffee++;
		}
		// Print result
		System.out.println("Count of coffee-request - " + numOfCoffee);
		scanner.close();
	}

	/*
	*	This is a simple function that  handles input errors.
	*	The input has to be an integer.
	*	And also a number bigger than one.
	*/

	private static int validInput(String input)
	{
		int num;

		num = 0;
		try 
		{
            num = Integer.parseInt(input);
        } 
		catch (NumberFormatException e)
		{
            System.err.println("Illegal Argument. Please enter a valid integer.");
            System.exit(-1);
        }
		if (num < 2)
		{
			System.err.println("Illegal Argument. The number must be greater than or equal to 2.");
           	System.exit(-1);
		}
		return (num);
	}

	/*
	*	This function check wheter the number is a prime or not.
	*/
	private static boolean isPrime(int sum)
	{
		for (int i = 2; i <= Math.sqrt(sum); ++i)
		{
			if (sum % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}