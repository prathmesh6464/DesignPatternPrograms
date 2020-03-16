package EagerInitializedSingleton;


class EagerIntialization
{
	//SATIC VARIABLE
	static int objectCount = 0;


	//ONLY ONE OBJECT CREATED
	private static final EagerIntialization onlyOneInstance = new EagerIntialization();


	//private constructor to avoid client applications to use constructor
	private EagerIntialization()
	{
		objectCount++;
	}


	//RETURN OBJECT
	public static EagerIntialization getInstance()
	{
		return onlyOneInstance;		
	}
}


//CLASS EAGERINITIALIZEDSINGLETON
class EagerInitializedSingleton 
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
		EagerIntialization firstObjectReference = EagerIntialization.getInstance();
		EagerIntialization firstObjectReference2 = EagerIntialization.getInstance();
		System.out.println(firstObjectReference2.objectCount);
	}
}  