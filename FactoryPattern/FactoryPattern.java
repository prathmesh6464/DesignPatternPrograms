package FactoryPattern;

interface Computer
{
	void showComputerType();
}

class Pc implements Computer
{
	public void showComputerType()
	{
		System.out.println("Pc");
	}
}
class Laptop implements Computer
{
	public void showComputerType()
	{
		System.out.println("Laptop");
	}
}

class ServerComputer implements Computer
{
	public void showComputerType()
	{
		System.out.println("ServerComputer");
	}
}


public class FactoryPattern 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
}
