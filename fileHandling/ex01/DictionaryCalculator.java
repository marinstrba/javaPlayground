import java.util.List;
import java.util.Arrays;

public class DictionaryCalculator {
  
  public static int[] countOccurance(List<String> dictionary, List<String> universalDictionary)
  {
    int[] occurance = new int[universalDictionary.size()];


    for (int i = 0; i < universalDictionary.size(); ++i)
    {
      String word = universalDictionary.get(i);
      int sum = 0;
      for (String universalWord : dictionary)
      {
        if(universalWord.equals(word))
          sum++;
      }
      occurance[i] = sum;
    }
    System.out.println(Arrays.toString(occurance));
    return occurance;
  }

  public static double calculateSimiliarity(int[] A, int[] B)
  {
    double result;
    int numerator;
    double denomirator;

    result = 0;
    numerator = 0;
    for (int i = 0; i < A.length; ++i)
      numerator += A[i] * B[i];
    denomirator = (double) Math.sqrt(countDenomirator(A)) * Math.sqrt(countDenomirator(B));
    System.out.println("This is numerator: " + numerator + "\n" +
      "This is denomirator: " + denomirator + "\ndenomirator A: " + countDenomirator(A)
      + "\ndenomirator B: " + countDenomirator(B));
    result = (double) numerator/denomirator;
    return result;
  }

  private static int countDenomirator(int[] array)
  {
    int result;

    result = 0;
    for (int i = 0; i < array.length; ++i)
      result += array[i] * array[i];

    return result;
  }
}
