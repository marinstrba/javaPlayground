import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
	public static void main(String[] args)
	{

		// Declaration and initialization of variables.
		int			sum;
		char		letter;
		String 		input;
		List<Integer> frequency = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Calling the functions for input and frequency.
		input = checkInput(scanner);
		getLetterUsage(input, frequency);
		/*
		* Sorting and reversing the array so its from 
		* most frequent to least frequent.
		*/ 
		Arrays.sort(frequency, Collections.reverseOrder());

		// Printing the result and closing scanner.
		printResult(frequency);
		scanner.close();
	}

	/*
	* Function that takes an input.
	*/

	private static String checkInput (Scanner scanner)
	{
		String input;
		System.out.println("Please input your text:");	
		input = scanner.nextLine();
		return (input);
	}

	/*
	* Function that counts the frequency of letters in a string,
	* and the puts them into a List.
	*/


	private static void getLetterUsage (String str, List<Integer> frequency)
	{
		int 	count;
		char	target;
		String	string;

		target = 'a';
		string = str.toLowerCase();
		while (target <= 'z')
		{
			count = 0;
			for (int i = 0; i < string.length(); ++i)
			{
				if (string.charAt(i) == target)
					count++;
			}
			target++;
			if (count != 0)
				frequency.add(count);
		}
	}

	/*
	* Function that prints an input.
	*/

	private static void printResult(List<Integer> frequency)
	{
		for (int i = 0; i < frequency.size; ++i)
		{

		}
	}
}
