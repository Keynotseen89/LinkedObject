
public abstract class ShellLinkedList {

	//Create protected Objects of
	//PlayerNode and a variable of numberOfItems
	protected PlayerNode head;
	protected int numberOfItems;
	
	//default constructor
	public ShellLinkedList()
	{
		head = null;
		numberOfItems = 0;
	}
	
	/**accessor for numberOfItems
	 * 
	 * @return numberOfItems
	 */
	public int getNumberOfItems()
	{
		return numberOfItems;
	}
	
	/**
	 * IsEmpty
	   @return true if no item in list; false otherwise
	*/
	public boolean isEmpty()
	{
		return( numberOfItems == 0);
	}
	
	/** toString
	 *  @return the contents of the list
	 */
	public String toString()
	{
		String listString = "";
		PlayerNode current = head;
		while( current != null )
		{
			listString += current.getPlayer().toString() + "\n";
			current = current.getNext();
		}
		return listString;
	}
	
	
}
