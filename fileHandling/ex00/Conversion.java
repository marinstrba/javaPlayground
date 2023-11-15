import java.io.*;

public class Conversion {

  public static int numberOfLines(String pathToFile)
  {
    int lines;

    lines = 0;
    try(BufferedReader reader = new BufferedReader(new FileReader(pathToFile)))
    {
      while (reader.readLine() != null)
        lines++;
    } catch (Exception e) {
      System.out.println("MISTAKE!!!");
    }
    return lines;
  }

  public static String[][] fileType (String pathToFile)
  {
    File file = new File(pathToFile);
    String[][] fileTypeArray = new String[numberOfLines(pathToFile)][];

    try(BufferedReader reader = new BufferedReader(new FileReader(file)))
    {
      int currentLine;
      String line;

      currentLine = 0;
      while ((line = reader.readLine()) != null)
      {
        String[] parts = line.split(",\\s*");
        if (parts.length > 1) {
          fileTypeArray[currentLine] = new String[] { parts[0], parts[1] };
        } else {
          fileTypeArray[currentLine] = new String[] { parts[0], "" };
        }
        currentLine++;
      }

    } catch (IOException e)
    {
      System.out.println("Mistake in reading of the file: " + e.getMessage());
    }

    return fileTypeArray;
  }
  
}
