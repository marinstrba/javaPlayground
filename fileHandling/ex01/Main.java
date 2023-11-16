import java.util.List;

class Main
{
  public static void main(String[] args)
  {
      List<String> listA = null;
      List<String> listB = null;

    if (args.length == 2)
    {

      listA = ConvertDictionaries.dictionary(args[0]);
      listB = ConvertDictionaries.dictionary(args[1]);

    }
    else
    {
      System.out.println("Wrong number of arguments. Expected number is 2");
      return ;
    }

    List<String> dictionary = ConvertDictionaries.universalDictionary(listA, listB);
    int[] A = DictionaryCalculator.countOccurance(listA,dictionary);
    int[] B = DictionaryCalculator.countOccurance(listB,dictionary);

    double similarity = DictionaryCalculator.calculateSimiliarity(A,B);

    System.out.println("Similiariry = " + similarity);
  }
}