
public class Room
{
	//We begin in room 0
	static int roomNumber = 0;
	
	public static void enter()
	{
		//We immediately move forward a room upon entry
		roomNumber++;
		
		if(roomNumber == 1)
		{
			System.out.println("You wake up and find yourself in a room.");

			//Character setup
			System.out.println("Feeling a bit dazed, You have a hard time recalling your name. What is it?");

			Player.nameSet();
			System.out.println("Yeah, your name is " + Player.name + ". How could you forget?");
			
			System.out.println("But what were you? After a quick look over yourself you confirm you are human. But what did you do?");
			System.out.println("After you inspect your possesions, you believe you were a:");
			
			Player.classSet();
			System.out.println("You do some reflecting, and coming up blank, consider " + Player.plclass + " to be close enough.");
			
			System.out.println("Well, what are you going to do?");
			
		}else if(roomNumber >= 2)
		{
			System.out.println("You pass through the door and find yourself in another room. The door slams behind you.");
		}
	}
	//If the player looks around the room, he will get the appropriate room's description
	public static void description()
	{
		if(roomNumber == 1)
		{
			System.out.println("The room you find yourself in is not very large, a bit cobwebby, and about 10 feet long and similarly wide.");
			System.out.println("There is a door in front of you, to the North, as you'll call it. The other walls are bare, other than some striped wallpaper.");
		
		}else if(roomNumber == 2)
		{
			System.out.println("The room is very similar to the last room you were in. Empty, with striped wallpaper adorning the walls. ");
			System.out.println("Actually, it bears an eerie resembalance to the previous room, besides the now sealed door behind you.");
		
		}else if(roomNumber >= 3)
		{
			System.out.println("The room is very similar to the last room you were in. Empty, with striped wallpaper adorning the walls. ");
			System.out.println("Upon further inspection, you cant find a single difference. Even the cobwebs on the walls and ceiling seem the same. Very strange.");
		}
	}
}
