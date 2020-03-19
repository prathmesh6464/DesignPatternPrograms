package SerializationAndSingleton;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


//SERIALIZATION SINGLETON CLASS
class SerializationSingleton implements Serializable
{
	//STATIC VARIABLE
	private static final long serialVersionUID = -7604766932017737115L;


	//CONSTRUCTOR
	private SerializationSingleton()
	{
		System.out.println("Constructor");
	}


	//STATIC INNER CLASS
	private static class SingletonHelper
	{
		private static final SerializationSingleton instance = new SerializationSingleton();
	}


	//RETURN INSTANCE
	public static SerializationSingleton getInstance()
	{
		return  SingletonHelper.instance;
	}  
	
	
	//ADDED FOR SAME OBJECT
	protected Object readResolve() 
	{
	    return getInstance();
	}
}


//SERIALIZATION AND SINGLETON
public class SerializationAndSingleton
{
	//MAIN CLASS
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//SERAILIZE FROM OBJECT TO FILE
		Object instanceOne = SerializationSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\King\\eclipse-workspace\\SnakeAndLadderProgram\\SerializationFile.txt"));
		out.writeObject(instanceOne);
		out.close();


		//DESERAILIZE FROM FILE TO OBJECT
		ObjectInput in = new ObjectInputStream(new FileInputStream("C:\\Users\\King\\eclipse-workspace\\SnakeAndLadderProgram\\SerializationFile.txt"));
		SerializationSingleton instanceTwo = (SerializationSingleton) in.readObject();
		in.close();


		System.out.println("instanceOne hashCode="+instanceOne.hashCode());
		System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());        
	}
}


