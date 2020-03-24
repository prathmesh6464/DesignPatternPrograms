package ObserverDesignPattern;
import java.util.ArrayList;
import java.util.List;


//OBSERVER INTERFACE
interface Observer
{
	void update();
	void setSubject(Subject subject);
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
class MyTopic implements Subject 
{
	private List<Observer> observers;
	private String message;

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

	@Override
	public Object getUpdate()
	{
		return this.message;
	}

	//METHOD POST MESSAGE TO POST THE MESSAGE
	public void addTopic(String message)
	{
		System.out.println("Message posted to topic : "+message);
		this.message = message;
		notifyObservers();
	}
}


//CLASS MY TOPIC SUBSCRIBER
class MyTopicSubscriber implements Observer 
{
	private String subscriberName;
	private Subject topic;

	//CONSTRUCTOR
	public MyTopicSubscriber(String subscriberName)
	{
		this.subscriberName = subscriberName;
	}

	@Override
	public void update() 
	{
		String message = (String) topic.getUpdate();
		System.out.println(subscriberName+" please check "+message);
	}

	@Override
	public void setSubject(Subject subject) 
	{
		this.topic = subject;		
	}
}


//CLASS OBSSERVER DESIGN PATTERN 
public class ObserverDesignPattern
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
		//CREATE SUBJECT
		MyTopic topic = new MyTopic();

		//OBJECT OF MY TOPIC SUBSCRIBER
		Observer objectScriber1 = new MyTopicSubscriber("prathamesh");
		Observer objectScriber2 = new MyTopicSubscriber("pratham");
		Observer objectScriber3 = new MyTopicSubscriber("prajwal");
		Observer objectScriber4 = new MyTopicSubscriber("praful");
		Observer objectScriber5 = new MyTopicSubscriber("pratik");

		//REGISTER OBSERVERS TO THE SUBJECT
		topic.register(objectScriber1);
		topic.register(objectScriber2);
		topic.register(objectScriber3);
		topic.register(objectScriber3);
		topic.register(objectScriber3);

		//ATTACH OBSERVER TO SUBJECT
		objectScriber1.setSubject(topic);
		objectScriber2.setSubject(topic);
		objectScriber3.setSubject(topic);
		objectScriber4.setSubject(topic);
		objectScriber5.setSubject(topic);

		//REMOVE OBSERVER TO SUBJECT
		topic.unregister(objectScriber3);
		topic.unregister(objectScriber4);

		//SEND MESSAGE TO SUBJECT
		topic.addTopic("New topic added - how to prevent corona virus");
	}
}