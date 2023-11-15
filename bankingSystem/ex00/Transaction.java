import java.util.UUID;

public class Transaction
{
	private final UUID 	ID;
	private User		sender;
	private	User		recipient;
	private	int			transferAmount;

	public Transaction()
	{
		ID = UUID.randomUUID();
	}

	public UUID getID()
	{
		return ID;
	}

	public User getSender()
	{
		return sender;
	}

	public User getRecipient()
	{
		return recipient;
	}

	public	int	getTransferAmount()
	{
		return transferAmount;
	}

	public void setSender(User sender)
	{
		this.sender = sender;
	}

	public void setRecipient(User recipient)
	{
		this.recipient = recipient;
	}

	public void setTransferAmount(int transferAmount)
	{
		this.transferAmount = transferAmount;
	}

	public void printConsole(UUID ID, int transferAmount, User sender, User recipient)
	{
		System.out.print("\nID: " + getID() +
		"\nSender: " + getSender().getName() + " " + -1 * getTransferAmount() + " " + getSender().getTransferType() +
		"\nRecipient: " + getRecipient().getName() + " " + getTransferAmount() + " " + getRecipient().getTransferType() +
		"\n\n||SENDER||\n" + "ID: " + sender.getID() + "\nName: " + sender.getName() + "\nBalance: " + sender.getBalance() +
		"\n\n||RECIPIENT||\n" + "ID: " + recipient.getID() + "\nName: " + recipient.getName() + "\nBalance: " + recipient.getBalance() + "\n");
	}

}