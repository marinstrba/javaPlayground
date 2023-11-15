public class UserNotFoundException extends RuntimeException
{

    @Override
    public String toString()
	{
        return "ID non existent";
    }
}