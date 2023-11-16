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

      try{
      Store store = new Store();


      Thread eggThread = new Thread(new Egg(count[0],store));
      Thread henThread = new Thread(new Hen(count[0],store));

      eggThread.start();
      henThread.start();
      eggThread.join();
      henThread.join();
      } catch (Exception e)
      {
        e.getCause();
      }
  }
}