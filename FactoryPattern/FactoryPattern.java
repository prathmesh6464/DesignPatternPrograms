package FactoryPattern;


//COMPUTER INTERFACE
interface Computer
{
	//ABSTRACT METHOD
	void showComputerType();
}


//PC CLASS IMPLEMENTS COMPUTER INTERFACE
class Pc implements Computer
{
	@Override
	public void showComputerType()
	{
		System.out.println("Pc");
	}
}


//LAPTOP CLASS IMPLEMENTS COMPUTER INTERFACE
class Laptop implements Computer
{
	@Override
	public void showComputerType()
	{
		System.out.println("Laptop");
	}
}


//SERVER COMPUTER CLASS IMPLEMENTS COMPUTER INTERFACE
class ServerComputer implements Computer
{
	@Override
	public void showComputerType()
	{
		System.out.println("ServerComputer");
	}
}


class ComputerFactory
{
	
}

//FACTORY PATTERN CLASS
public class FactoryPattern
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
		
	}
}
