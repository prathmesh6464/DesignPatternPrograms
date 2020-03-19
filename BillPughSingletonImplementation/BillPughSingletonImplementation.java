package BillPughSingletonImplementation;


//BILL PUGH SINGLETON CLASS
class BillPughSingleton 
{
	//VARIABLE
	static int temparoryCheck = 0;


	//CONSTRUCTOR WILL BE CALLED ONLY ONCE
	private BillPughSingleton()
	{
		temparoryCheck++;
		System.out.println(temparoryCheck);
	}


	//NO NEED OF SYNCHRONIZATION
	private static class SingletonHelper
	{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}


	//RETURNING OBJECT
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
}


//BILL PUSH SINGLETON IMPLEMENTATION CLASS
public class BillPughSingletonImplementation
{
	//MAIN CLASS
	public static void main(String[] args)
	{
		//CREATING FIRST OBJECT REFERENCE
		BillPughSingleton billPughSingletonObject = BillPughSingleton.getInstance();
		billPughSingletonObject.getInstance();


		//CREATING SECOND OBJECT REFERENCE
		BillPughSingleton billPughSingletonObject2 = BillPughSingleton.getInstance();
		billPughSingletonObject.getInstance();	
	}
}