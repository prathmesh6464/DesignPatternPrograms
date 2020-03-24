package ObserverDesignPattern;


//OBSERVER INTERFACE
interface Observer
{
	void update();
	void setSubject();
}


//SUBJECT INTERFACE
interface Subject
{
	void register(Observer observerOnTopic);
	void unregister(Observer observerUnRegister);
	void notifyObservers();
	Object getUpdate();
}


//CLASS MY TOPIC
class MyTopic implements Observer,Subject 
{
	String message;
	boolean changed;
	Object MUTEX; 

}


//CLASS OBSSERVER DESIGN PATTERN 
public class ObserverDesignPattern
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}