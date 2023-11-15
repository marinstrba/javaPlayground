import java.io.*;

class Main {

  private static final String resultFileText = "result.txt";
  private static final String signatureFileText = "signatures.txt";
  public static void main (String[] args)
  {

    File inputFile = null;
    File resultFile = new File(resultFileText);

    if (0 < args.length)
    {
      inputFile = new File(args[0]);
      if(!inputFile.exists())
      {
        System.out.println("The file doesnt exist :(");
        return ;
      }
    }
    else
    {
      System.out.println("Invalid number of arguments: " + args.length);
      System.out.println("Expected number of arguments is 1.");
      return ;
    }

    try {
      resultFile.createNewFile();
    } catch (IOException e)
    {
      System.out.println("There has been an error " + e.getMessage());
      return ;
    }

    String[][] signatureArray = Conversion.fileType(signatureFileText);
    
    try(FileInputStream fileInputStream = new FileInputStream(inputFile))
    {
      
      boolean check;
      check = false;
      for (int index = 0; index < Conversion.numberOfLines(signatureFileText); index++)
      {
        String fileTypeSignature;
        check = true;
        fileTypeSignature = signatureArray[index][1].replaceAll("\\s", "");
        byte[] fileSignatureBytes = new byte[fileTypeSignature.length() / 2];
        fileInputStream.getChannel().position(0);
        fileInputStream.read(fileSignatureBytes, 0, fileSignatureBytes.length);

        for (int i = 0; i < fileTypeSignature.length()/2; ++i)
        {
          int fileByte = fileSignatureBytes[i] & 0xFF;
          String hexPair = fileTypeSignature.substring(i * 2, i * 2 + 2);
          int signatureByte = Integer.parseInt(hexPair, 16);

          if (fileByte != signatureByte)
          {
            check = false;
            break ;
          }
        }
        if (check == true) {
          System.out.println("This is the type of file: " + signatureArray[index][0]);
          try (FileWriter writer = new FileWriter(resultFile))
          {
            writer.write(signatureArray[index][0]);
          } catch (Exception e)
          {
            System.out.println("Error has occured: " + e.getMessage());
          }
          return ;
        }
      }
    } 
    catch (Exception e) {
      System.out.println("Mistake occured: " + e.getMessage());
    }
  }
}