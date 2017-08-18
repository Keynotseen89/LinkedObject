
public class Player {
	private int id;
	private String name;
	private String game;
	
	/**
	 * 
	 * @param i
	 * @param n
	 * @param g
	 */
	public Player(int i, String n, String g)
	{
		id = i;
		name = n;
		game = g;
	}
	
	/**
	 * 
	 * @return id
	 */
	public int getID()
	{
		return id;
	}
	
	/**
	 * 
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return game
	 */
	public String getGame()
	{
		return game;
	}
	
	/**
	 * 
	 * @param i
	 */
	public void setID(int i)
	{
		id = i;
	}
	

	/**
	 * Mutator for name
	 * @param n
	 */
	public void setName(String n)
	{
		name = n;
	}
	/**
	 * Mutator for game
	 * @param g
	 */
	public void setGame(String g)
	{
		game = g;
	}
	
	/**
	 *  @boolean equals for Object
	 */
	public boolean equals( Object p)
	{
		//If Object p is not an instance of
		//Player Object then return false 
		//else do next statement
		if(!(p instanceof Player))
			return false;
		else
		{
			Player objPlayer = (Player) p;
			return (id == objPlayer.id && name.equals(objPlayer.name)
					&& game.equals( objPlayer.game));
		}
	}//end of boolean
	
	public String toString()
	{
		return("id: " + id + "\tname: " + name + "\tgame: " + game);
	}
}
