package EnumSingleton;


//ENUM
enum EnumSingletonEnum
{
	INSTANCE;
	int temparoryCheck = 0;
	
	
	//PRIVATE DEFAULT CONSTRUCTOR
	private EnumSingletonEnum()
	{
		temparoryCheck++;
	}

	
	//METHOD TO SHOW VARIABLE VALUE
	public void showTemparoryCheck()
	{
		System.out.println(temparoryCheck);
	}
}


//ENUM SINGLETON CLASS
public class EnumSingleton
{
	//MAIN METHOD
	public static void main(String args[])
	{
		//CREATING OBJECT REFERENCE AND SHOWING VALUE OF VARIABLE
		EnumSingletonEnum enumObject = EnumSingletonEnum.INSTANCE;
		enumObject.temparoryCheck = 10;
		enumObject.showTemparoryCheck();
	
		
		//SECOND TIME ALSO SHOWN 10 OUTPUT
		EnumSingletonEnum enumObject2 = EnumSingletonEnum.INSTANCE;
		enumObject2.showTemparoryCheck();
	}
}

