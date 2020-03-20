package AdapterDesignPattern;


class Volt 
{
	private int volts;
	
	public Volt(int v)
	{
		this.volts=v;
	}

	public int getVolts()
	{
		return volts;
	}

	public void setVolts(int volts)
	{
		this.volts = volts;
	}	
}


class Socket
{

	public Volt getVolt()
	{
		return new Volt(120);
	}
}


public class AdapterDesignPattern 
{
	
	public static void main(String args[]) 
	{
		  
	}
}
