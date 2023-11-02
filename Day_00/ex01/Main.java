import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int		num;
		int		numOfIterations;
		boolean bool;

		bool = true;
		numOfIterations = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer: ");
		if (!scanner.hasNextInt())
		{
			System.err.println("Illegal Argument");
			System.exit(-1);
		}
		num = scanner.nextInt();
		
		if (num < 2)
		{
            System.err.println("Illegal Argument. The number must be greater than or equal to 2.");
            System.exit(-1);
        }
		for (int i = 2; i <= Math.sqrt(num); ++i)
		{
			if (num % i == 0)
			{
				bool = false;
				break ;
			}
			numOfIterations++;
		}

		if (bool)
			System.out.println("True " + (numOfIterations + 1));
		else
			System.out.println("False " + (numOfIterations + 1));
		
		scanner.close();
	}
}