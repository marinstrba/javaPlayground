public class TransactionNode
{
	private Transaction data;
	private TransactionNode next;
	private TransactionNode previous;

	public TransactionNode(Transaction data)
	{
		this.data = data;
	}

	public void setNext(TransactionNode next)
	{
		this.next = next;
	}

	public void setPrevious(TransactionNode previous)
	{
		this.previous = previous;
	}

	public Transaction getData()
	{
		return data;
	}

	public TransactionNode getNext()
	{
		return next;
	}

	public TransactionNode getPrevious()
	{
		return previous;
	}
}
