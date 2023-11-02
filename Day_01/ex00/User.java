public class User
{
	private String			name;
	private Integer			ID;
	private double			balance;
	private String			transferType;

	public String getName()
	{
		return name;
	}

	public Integer getID()
	{
		return ID;
	}

	public double getBalance()
	{
		return balance;
	}

	public String getTransferType()
	{
		return transferType;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setID(Integer ID)
	{
		this.ID = ID;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public void setTransferType(String transferType)
	{
		this.transferType = transferType;
	}

	public void printConsole()
	{
		System.out.format("\nID: %d\nName: %s\nBalance: %d\n", ID, name, balance);
	}
}
