package BillPughSingletonImplementation;


public class BillPughSingletonImplementation 
{
	//CONSTRUCTOR WILL BE CALLED ONLY ONCE
    private BillPughSingletonImplementation()
    {
    	System.out.println("Constructor");
    }
        
    
    //NO NEED OF SYNCHRONIZATION
    private static class SingletonHelper
    {
        private static final BillPughSingletonImplementation INSTANCE = new BillPughSingletonImplementation();
    }
        
    
    public static BillPughSingletonImplementation getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
}
