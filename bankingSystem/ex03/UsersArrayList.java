public class UsersArrayList implements UsersList
{	
	private User[] 		userArray =	new User[10];
	private int 		countUser = 0;

	@Override
	public void addUser(User newUser)
	{
		if (countUser >= userArray.length)
		{
			User[] temp = new User[userArray.length * 2];
			for (int i = 0; i < userArray.length; ++i)
			{
				temp[i] = userArray[i];
			}
			userArray = temp;
		}
		userArray[countUser] = newUser;
		countUser++;
	}

	@Override
	public User findUserID(Integer ID)
	{
		for (int i = 0; i < countUser; ++i)
		{
			if (userArray[i].getID() == ID)
				return userArray[i];
		}
		throw new UserNotFoundException();
	}

	@Override
	public User findUserIndex(int index)
	{
		if (index > countUser)
			throw new UserNotFoundException();
		return userArray[index];
	}

	@Override
	public int getAmountUser()
	{
		return countUser;
	}
}