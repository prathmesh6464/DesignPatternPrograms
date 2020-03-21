package AdapterDesignPattern;


//CLASS VOLT
class Socket
{
	int volt;

	public int getVolt() 
	{
		return volt;
	}

	public Socket(int volt) 
	{
		this.volt = volt;
	}	
}


//SOCKET ADAPTER INTERFACE
interface SocketAdapter
{
	//ABSTRACT METHODS
	public int get120Volt();
	public int get12Volt();
	public int get3Volt();
}


//INTERFACE SOCKET VOLT ADAPTER
interface SocketVoltAdapter
{
	
}

//CLASS SOCKET ADAPTER IMPLEMENTATION
class socketAdapterImplementation extends Socket 
{
	public socketAdapterImplementation()
	{
		// TODO Auto-generated constructor stub
	}
}
