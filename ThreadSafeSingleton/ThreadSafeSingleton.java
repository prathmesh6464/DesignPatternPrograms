package ThreadSafeSingleton;


//THREAD SAFE CLASS
class ThreadSafe implements Runnable
{
	int temparoryCheckCout = 0;
	//DECLARING OBJECT REFERENCE
	private static ThreadSafe instance;


	private ThreadSafe()
	{
		temparoryCheckCout++;
		System.out.println(temparoryCheckCout);
	}


	//PROPER CREATION OF OBJECT  FOR EVERY SINGLE THREAD
	public static synchronized ThreadSafe getInstance()
	{
		if(instance == null)
		{
			instance = new ThreadSafe();
		}
		return instance;
	}


	@Override
	public void run()
	{
		// TODO Auto-generated method stub
	}
}


//THREAD SAFE SINGLETON CLASS
class ThreadSafeSingleton
{
	//MAIN METHOD
	public static void main(String args[])
	{
		//FIRST THREAD
		Thread firstThread = new Thread(new Runnable()
		{
			@Override
			public void run() 
			{
				ThreadSafe firstObjectReference = ThreadSafe.getInstance();
			}	
		});
		
		
		//SECOND THREAD
		Thread secondThread = new Thread(new Runnable()
		{
			@Override
			public void run() 
			{
				ThreadSafe secondObjectReference = ThreadSafe.getInstance();
			}	
		});
		
		
		//STARTING THREAD
		firstThread.start();
		secondThread.start();
	}
}