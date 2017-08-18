
public class PlayerNode {

	//Create private objects of
	//Player and PlayerNode
	private Player player;
	private PlayerNode next;
	
	//default constructor
	public PlayerNode()
	{
		player = null;
		next = null;
	}
	
	/**overloaded constructor
	 * 
	 * @param p
	 */
	public PlayerNode( Player p)
	{
		setPlayer(p);
		next = null;
	}
	
	/**Accessor for player
	 * 
	 * @return player
	 */
	public Player getPlayer()
	{
		return player;
	}
	
	/**accessor for next
	 * 
	 * @return next
	 */
	public PlayerNode getNext()
	{
		return next;
	}
	
	/**Mutator for player
	 * 
	 * @param p
	 */
	public void setPlayer(Player p)
	{
		player = p;
	}
	
	/**Mutator for next
	 * 
	 * @param pn
	 */
	public void setNext( PlayerNode pn )
	{
		next = pn;
	}
}
