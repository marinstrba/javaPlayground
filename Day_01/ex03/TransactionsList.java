import java.util.UUID;

public interface TransactionsList
{
	public void addTransaction(Transaction transaction);
	public void removeATransaction(UUID id);
	public Transaction[] transformToArray();
}