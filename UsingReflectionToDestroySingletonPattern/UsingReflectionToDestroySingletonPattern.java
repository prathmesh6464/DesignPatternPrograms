package UsingReflectionToDestroySingletonPattern;
import java.lang.reflect.Constructor;


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


//REFLECTION TO DESTROY SINGLETON PATTERN
public class UsingReflectionToDestroySingletonPattern
{
	public static void main(String[] args) 
	{
		EagerIntialization instanceOne = EagerIntialization.getInstance();
		EagerIntialization instanceTwo = null;
		try 
		{
			Constructor[] constructors = EagerIntialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) 
			{
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerIntialization) constructor.newInstance();
				break;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println(instanceOne.objectCount);
		System.out.println(instanceTwo.objectCount);
	}
}