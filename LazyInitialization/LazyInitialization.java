package LazyInitialization;


class LazyInitializedSingleton
{
    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton()
    {
    	System.out.println("Constructore");
    }
        
    public static LazyInitializedSingleton getInstance()
    {
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}


//CLASS LAZY INITIALIZATION
public class LazyInitialization
{
	//MAIN METHOD
	public static void main(String[] args)
	{
		LazyInitializedSingleton LazySingletonObject = LazyInitializedSingleton.getInstance();
	}
}