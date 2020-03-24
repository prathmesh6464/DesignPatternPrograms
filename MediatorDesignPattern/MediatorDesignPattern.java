package MediatorDesignPattern;
import java.util.Date;


//CLASS CHAT ROOM
class ChatRoom
{
	public static void showMessage(User userName, String message)
	{
		System.out.println(new Date().toString()+" message Sent by : "+userName.getName()+"\n"+"\t"+message+"\n");
	}
}


//CLASS USER
class User
{
	String userName;
	
	String getName()
	{
		return userName;		
	}
	
}


//CLASS MEDIATORDESIGNPATTERN
public class MediatorDesignPattern 
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
		

	}

}
