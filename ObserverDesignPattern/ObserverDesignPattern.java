package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

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
	//Object getUpdate();
}


//CLASS MY TOPIC
class MyTopic implements Subject 
{
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	//CONSTRUCTOR
	public MyTopic()
	{
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer observerAdded)
	{
		observers.add(observerAdded);
	}

	@Override
	public void unregister(Observer observerRemove) 
	{
		observers.remove(observerRemove);
	}

	@Override
	public void notifyObservers() 
	{
		for (Observer obj : observers)
		{
			obj.update();
		}
	}
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