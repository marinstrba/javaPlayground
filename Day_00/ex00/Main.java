import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// Declaration of variables
		long	num;
		int 	sum;

		// Initialization of variables
		sum = 0;

		// Declaration of a scanner and user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write an integer: ");

		while (!scanner.hasNextInt())
		{
            System.out.println("That's not a valid input. Please enter an integer: ");
            scanner.next();
        }
		num = scanner.nextInt();

		// Algorithm for calculation of the sum
		if (num < 0) {num *= -1;}
		while (num > 0)
		{
			sum += num % 10;
			num /= 10;
		}

		System.out.println("This is the sum of all the digits: " + sum);
	}
}
