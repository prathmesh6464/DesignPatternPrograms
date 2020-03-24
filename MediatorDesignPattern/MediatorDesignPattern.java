package MediatorDesignPattern;
import java.util.Date;


//CLASS CHAT ROOM
class ChatRoom
{
	public static void showMessage(User userName, String message)
	{
		System.out.println(new Date().toString()+" message Sent by : "+userName.getName()+"\n"+"\t\t\t\t\t   --> "+message+"\n");
	}
}


//CLASS USER
class User
{
	String userName;

	//GETTER
	public String getName()
	{
		return userName;		
	}

	//SETTER
	public void setName(String name)
	{
		this.userName = name;
	}

	public void sendMessage(String message)
	{
		ChatRoom.showMessage(this, message);
	}	
}


//CLASS MEDIATORDESIGNPATTERN ACTS AS A MEDIATER
public class MediatorDesignPattern 
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
		User userObject = new User();

		//USER ONE
		userObject.setName("Prathamesh");
		userObject.sendMessage("Don't take it normally, situation is realy critical i think we should stay only at home");

		//USER TWO
		userObject.setName("Imran shaikh");
		userObject.sendMessage("Are you talking about corona virus??");

		//USER THREE
		userObject.setName("Bridz labz");
		userObject.sendMessage("Please come to office");
	}
}
