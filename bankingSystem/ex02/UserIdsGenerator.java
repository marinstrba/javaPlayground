public class UserIdsGenerator
{
    private static UserIdsGenerator instanse = null;
    private static int id = 0;
    private UserIdsGenerator() {}

    public static UserIdsGenerator getInstance()
	{
        if (instanse == null) {
            instanse = new UserIdsGenerator();
        }
        return instanse;
    }

    public int generateId()
	{
        return id++;
    }
}