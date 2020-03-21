package AdapterDesignPattern;


//CLASS VOLT
class Volt 
{
	//INSTANCE VARIABLE
	private int volts;

	//PARAMETERISED CONSTRUCTOR
	public Volt(int voltValue)
	{
		this.volts = voltValue;
	}

	//GETTER METHOD
	public int getVolts() 
	{
		return volts;
	}

	//SETTER METHOD
	public void setVolts(int volts)
	{
		this.volts = volts;
	}	
}


//CLASS SOCKET
class Socket 
{
	//CONSTANT 
	int VOLT_VALUE = 120;

	//OBJECT OF VOLT CLASS
	Volt voltObject = new Volt(VOLT_VALUE);

	//GETTER METHOD
	public Volt getVolt()
	{
		return voltObject;
	}
}


//INTERFACE SOCKET ADAPTER
interface SocketAdapter
{
	public Volt get120Volt();		
	public Volt get12Volt();	
	public Volt get3Volt();
}


//CLASS SOCKET ADAPTER IMPLEMENTATION
class SocketClassAdapterImplementation extends Socket implements SocketAdapter
{
	@Override
	public Volt get120Volt() 
	{
		return getVolt();
	}

	@Override
	public Volt get12Volt() 
	{
		Volt voltObject = getVolt();
		return convertVolt(voltObject, 10);
	}

	@Override
	public Volt get3Volt() 
	{
		Volt voltObject = getVolt();
		return convertVolt(voltObject, 40);
	}

	private Volt convertVolt(Volt voltObject, int divideValueAccordigToVolt) 
	{
		return new Volt(voltObject.getVolts()/divideValueAccordigToVolt);
	}
}


//CLASS SOCKET ADAPTER IMPLEMENTATION WITH OBJECT
class SocketObjectAdapterImplementation implements SocketAdapter
{
	//OBJECT OF SOCKET
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt()
	{
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() 
	{
		Volt voltObject = sock.getVolt();
		return convertVolt(voltObject, 10);
	}

	@Override
	public Volt get3Volt()
	{
		Volt voltObject = sock.getVolt();
		return convertVolt(voltObject, 40);
	}

	private Volt convertVolt(Volt voltObject, int divideValueAccordigToVolt) 
	{
		return new Volt(voltObject.getVolts()/divideValueAccordigToVolt);
	}
}


//CLASS ADAPTER DESIGN PATTERN
public class AdapterDesignPattern 
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
		//USING CLASS ADAPTER IMPLEMENTATION
		SocketClassAdapterImplementation socketClassAdapterImplementationObject = new SocketClassAdapterImplementation();
		System.out.println(socketClassAdapterImplementationObject.get120Volt().getVolts());
		System.out.println(socketClassAdapterImplementationObject.get12Volt().getVolts());
		System.out.println(socketClassAdapterImplementationObject.get3Volt().getVolts());
		System.out.println();

		//USING CLASS ADAPTER IMPLEMENTATION
		SocketObjectAdapterImplementation socketObjectAdapterImplementationObject =  new SocketObjectAdapterImplementation();
		System.out.println(socketObjectAdapterImplementationObject.get120Volt().getVolts());
		System.out.println(socketObjectAdapterImplementationObject.get12Volt().getVolts());
		System.out.println(socketObjectAdapterImplementationObject.get3Volt().getVolts());
	}
}