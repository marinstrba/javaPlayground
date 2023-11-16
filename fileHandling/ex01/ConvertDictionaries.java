import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ConvertDictionaries{

  public static List<String> dictionary(String fileName)
  {
    //File file = new File(fileName);
    List<String> charDictionary = new ArrayList<>();
    try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
    {
      String line;
      while ((line = bufferedReader.readLine()) != null)
      {
        String[] words = line.split(" ");
        for (String word : words)
          charDictionary.add(word);
        
      } 
    }
    catch (IOException e)
    {
      System.out.println("Error reading the file " + fileName + " " + e.getMessage());
    }
    return charDictionary;
  }

  public static List<String> universalDictionary(List<String> fileA, List<String> fileB)
  {
    List<String> universalDictionary = new ArrayList<>();
    for (String word : fileA)
    {
      if(!universalDictionary.contains(word))
        universalDictionary.add(word);
    }
    for (String word : fileB)
    {
      if(!universalDictionary.contains(word))
        universalDictionary.add(word);
    }
    Collections.sort(universalDictionary);

    return universalDictionary;
  }
}