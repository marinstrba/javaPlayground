public interface UsersList
{
	public void addUser(User newUser);
	public User findUserID(Integer ID);
	public User findUserIndex(int index);
	public int getAmountUser();
}