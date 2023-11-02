import java.util.*;

public class Main
{
	public static void main(String[] args)
	{

		// Declaration and initialization of variables.
		int			avg;
		String 		input;
		List<Integer> frequency = new ArrayList<>();
		List<Character> letters = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Calling the functions for input and frequency.
		input = checkInput(scanner);
		getLetterUsage(input, frequency, letters);
		/*
		* Sorting and reversing the array so its from 
		* most frequent to least frequent.
		*/
		sortLists(frequency, letters);
		// Getting the average frequency so i can print the data with better visualization
		avg = getAvg(frequency);
		// Printing the result and closing scanner.
		printResult(frequency, letters ,avg);
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


	private static void getLetterUsage (String str, List<Integer> frequency, List<Character> letters)
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
			if (count != 0)
			{
				frequency.add(count);
				letters.add(target);
			}
			target++;
		}
	}

	/*
	* Function that sorts the lists accordingly.
	*/

	private static void sortLists(List<Integer> frequency, List<Character> letters)
	{
        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < frequency.size(); i++)
            pairs.add(new Pair(frequency.get(i), letters.get(i)));
        Collections.sort(pairs, (a, b) -> b.freq - a.freq);
        frequency.clear();
        letters.clear();
        for (Pair p : pairs)
		{
            frequency.add(p.freq);
            letters.add(p.letter);
        }
    }


	/*
	* Function that prints an input.
	*/

	private static int getAvg(List<Integer> frequency)
	{
		int sum;

		sum = 0;
		for (int i = 0; i < frequency.size(); ++i)
			sum += frequency.get(i);
		return (sum);
	}

	private static void printResult(List<Integer> frequency, List<Character> letters, int avg) {
		int rows = frequency.size();
		int maxFrequency = Collections.max(frequency);
		int maxNumHashes = (int) Math.round((double) maxFrequency / maxFrequency * avg);
		
		// Find the number of hashes for each letter
		int[] numHashes = new int[rows];
		for (int i = 0; i < rows; i++) {
			int freq = frequency.get(i);
			numHashes[i] = (int) Math.round((double) freq / maxFrequency * avg);
		}
		
		// Find the maximum number of hashes
		int maxHashes = 0;
		for (int i = 0; i < rows; i++) {
			if (numHashes[i] > maxHashes) {
				maxHashes = numHashes[i];
			}
		}
		
		// Print the frequencies
		for (int i = 0; i < rows; i++) {
			System.out.printf("%-4d", frequency.get(i));
		}
		System.out.println();
		
		// Print the hashes vertically
		for (int i = 0; i < maxHashes; i++) {
			for (int j = 0; j < rows; j++) {
				if (i < maxHashes - numHashes[j]) {
					System.out.print("    ");
				} else {
					System.out.print("#   ");
				}
			}
			System.out.println();
		}
		
		// Print the letters
		for (int i = 0; i < rows; i++) {
			System.out.print(letters.get(i) + "   ");
		}
		System.out.println();
	}
	
	
	static class Pair
	{
        int freq;
        char letter;
        
        Pair(int freq, char letter)
		{
            this.freq = freq;
            this.letter = letter;
        }
    }

}
