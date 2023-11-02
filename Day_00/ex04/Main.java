import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		int			sum;
		char		letter;
		String 		input;
		List<Integer> frequency = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		input = checkInput(scanner);
		while (true)
		{
			sum = getLetterUsage(input);
			frequency.add()
		}
		scanner.close();
	}

	private static String checkInput (Scanner scanner)
	{
		String input;
		System.out.println("Please input your text:");	
		input = scanner.nextLine();
		return (input);
	}

	private static int getLetterUsage (String string)
	{
		int sum;

		sum = 0;
		for (int i = 0; i < string.length(); ++i)
		{
			
		}

	}
}
