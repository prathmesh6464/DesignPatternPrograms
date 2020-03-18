package ThreadSafeSingleton;


class ThreadSafeSingleton 
{
	//DECLARING OBJECT REFERENCE
	private static ThreadSafeSingleton instance;


	private ThreadSafeSingleton()
	{
		System.out.println("Constructor");
	}


	//PROPER CREATION OF OBJECT  FOR EVERY SINGLE THREAD
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}