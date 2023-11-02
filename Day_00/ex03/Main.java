import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{

		// Declaration and initialization of variables.
		String			input;
		int				numOfWeeks;
		List<Integer> grades = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		numOfWeeks = 0;
		// Main while loop from which the code runs.
		while (true)
		{
			System.out.println("Week " + (numOfWeeks + 1));
			numOfWeeks++;
			input = scanner.nextLine();
			
			/* 
			* Here i split the string into seperate int's
			* so i can get the total sum.
			*/
			if (input.isEmpty()) break;
			String[] parts = input.split(" ");
            if (parts.length != 5)
			{
                System.err.println("Illegal argument");
                System.exit(-1);
            }

			// Addition of grades into the list.
			grades.add(sumOfGrades(parts));
			if (numOfWeeks == 18) break ;
		}

		printResults(grades);
		scanner.close();
	}

	/*
	* This is a function, that catches errors.
	* But not only that it also returns the sum of grades per week.
	*/


	private static int sumOfGrades(String[] parts)
	{
		int sum;

		sum = 0;
		for (int i = 0; i < parts.length; i++)
			{
                try
				{
                    int grade = Integer.parseInt(parts[i]);
					if (grade < 1 || grade > 10)
						throw new IllegalArgumentException("Grade must be between 1 and 10.");
                    sum += grade;
                }
				catch (NumberFormatException e)
				{
                    System.err.println("Illegal argument");
                    System.exit(-1);
                }
				catch (IllegalArgumentException e)
				{
        			System.err.println(e.getMessage());
        			System.exit(-1);
    			}
            }
		return (sum);
	}

	/*
	* This is a function, for printing my results.
	* I visualize the data according to the average grade.
	*/

	private static void printResults(List<Integer> grades)
	{
		for (int i = 0; i < grades.size(); ++i)
		{
			System.out.print("Week  " + (i + 1));
			int	num = grades.get(i);
			num /= 9;
			while (num > 0)
			{
				System.out.print("=");
				num--;
			}
			System.out.println(">");
		}
	}
}