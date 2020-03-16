package StaticBlockInitialization;


class StaticBlockSingleton
{
	//OBJECT DECLARED
	private static StaticBlockSingleton instance;

	
	//CONSTRUCTOR
	private StaticBlockSingleton()
	{
		System.out.println("Constructor");
	}

	
	//static block initialization for exception handling
	static
	{
		System.out.println("Static");
		try
		{
			instance = new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	
	//RETURNING OBJECT
	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}
}


//CLASS STATIC BLOCK SINGLETON
class StaticBlockSingletonType
{
	//MAIN METHOD
	public static void main(String[] args)
	{
		StaticBlockSingleton StaticBlockSingletonObject = StaticBlockSingleton.getInstance();
	}
}
