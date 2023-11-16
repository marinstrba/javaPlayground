class Main {

  public static void main(String[] args) {
    
      final int[] count = new int[1];

      if (args.length != 1)
      {
        System.out.println("Invalid number of arguments.");
      }
      if (args[0].startsWith("--count="))
      {
        try{
        count[0] = Integer.parseInt(args[0].substring("--count=".length()));
        } 
        catch (NumberFormatException nfe)
        {
           System.out.println("Invalid number format.");
         return ;
        }
      }


      Thread eggThread = new Thread(() -> {
        for (int i = 0; i < count[0]; ++i)
        {
          System.out.println("Egg");
        }
      });
      Thread henThread = new Thread(() -> {
        for (int i = 0; i < count[0]; ++i)
        {
          System.out.println("Hen");
        }
      });
      eggThread.start();
      henThread.start();
      try{
        eggThread.join();
        henThread.join();
      } catch (InterruptedException ie)
      {
        ie.printStackTrace();
      }
      for (int i = 0; i < count[0]; ++i)
      {
        System.out.println("Human");
      }

  }
}