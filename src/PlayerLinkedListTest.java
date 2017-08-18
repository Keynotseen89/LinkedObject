/**
 * @author Quinatzin Sintora 
 * Date: 7/23/2017
 * Description: The PlayerLinkedListTest is used with DataStructureException, Player, PlayerLinkedList, 
 * PlayerNode and ShellLinkedList Classes.
 * To test all the classes as a DataStruture.
 */
public class PlayerLinkedListTest {

	public static void main(String[] args) {
		
		//Giving each Object of Player new Values
		Player p1 = new Player( 7, "Sarah", " Mario");
		Player p2 = new Player( 2, "Jin", "Gold");
		Player p3 = new Player( 5, "Ajay", "Sonic");
		
		//construct empty PlayerLinkedList
		PlayerLinkedList player = new PlayerLinkedList();
		System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
		
		player.insert(p1);	//insert in empty list
		System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
	
		player.insert(p2); //insert in list of one item
		System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
		
		player.insert(p3);
		System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
		
		Player temp;	//will be assigned the deleted item
		
		try
		{
			temp = player.delete(8);	//unsuccessful
			System.out.println( "Player deleted: " + temp);
		}
		catch (DataStructureException dsel)
		{
			System.out.println( dsel.getMessage() + "\n");
		}
		
		try
		{
			temp = player.peek(2);
			System.out.println("Player retrieved: " + temp);
			System.out.println("Number of items in the list" + player.getNumberOfItems() + "\n" + player.toString());
			
			temp = player.delete(2);
			System.out.println("Player deleted: " + temp);
			System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
			
			temp = player.delete(7);
			System.out.println("Player deleted: " + temp);
			System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
			
			temp = player.delete(5);
			System.out.println("Player deleted: " + temp);
			System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
			
			temp = player.delete(7);
			System.out.println("Player deleted: " + temp);
			System.out.println("Number of items in the list: " + player.getNumberOfItems() + "\n" + player.toString());
		}
		catch( DataStructureException dse2 )
		{
			System.out.println( dse2.getMessage());
		}
	}

}
