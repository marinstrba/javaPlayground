import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList
{
	private Integer length = 0;
	private TransactionNode head;

	@Override
	public void addTransaction(Transaction transaction)
	{
		TransactionNode newNode = new TransactionNode(transaction);
		if (head != null)
		{
			head.setPrevious(newNode);
			newNode.setNext(head);	
		}
		head = newNode;
		length++;
	}

	@Override
	public void removeATransaction(UUID id)
	{
		TransactionNode tempHead = head;
		while (tempHead != null)
		{
			if (tempHead.getData().getID().equals(id))
			{
				if (tempHead.getPrevious() != null)
				{
                    tempHead.getPrevious().setNext(tempHead.getNext());
                }
				if (tempHead.getNext() != null)
				{
                    if (tempHead.getPrevious() == null)
					{
                        head = tempHead.getNext();
                    }
                    tempHead.getNext().setPrevious(tempHead.getPrevious());
                }
				else if (tempHead.getPrevious() == null)
				{
                	head = null; 
            	}
                length--;
                return ;
			}
			tempHead = tempHead.getNext();
		}
	}

	@Override
	public Transaction[] transformToArray()
	{
		Transaction[] newArray = new Transaction[length];
		TransactionNode currentHead = head;
		for (int i = 0; i < length; ++i)
		{
			newArray[i] = currentHead.getData();
			currentHead = currentHead.getNext();
		}
		return newArray;
	}
}