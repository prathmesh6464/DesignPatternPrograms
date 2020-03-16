package LazyInitialization;

public class LazyInitializedSingleton
{
    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}



//CLASS LAZY INITIALIZATION
class StaticBlockSingletonType
{
	//MAIN METHOD
	public static void main(String[] args)
	{
		StaticBlockSingleton StaticBlockSingletonObject = StaticBlockSingleton.getInstance();
	}
}