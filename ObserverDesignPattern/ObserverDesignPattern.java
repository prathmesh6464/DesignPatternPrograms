package ObserverDesignPattern;


interface Observer
{
	void update();
	void setSubject();
}
interface subject
{
	void register(Observer observerOnTopic);
	void unregister(Observer observerUnRegister);
	void notifyObservers();
	Object getUpdate();
}
class topic
{
	
}
public class ObserverDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}