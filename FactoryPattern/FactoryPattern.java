package FactoryPattern;
import java.util.Scanner;


//COMPUTER INTERFACE
interface Computer
{
	//ABSTRACT METHOD
	void showComputerType();
}


//PC CLASS IMPLEMENTS COMPUTER INTERFACE
class Pc implements Computer
{
	//PC CONSTRUCTOR WHEN OBJECT GETS CREATED DISPLAY MESSAGE
	Pc()
	{
		System.out.println("Pc object created");
	}


	@Override
	public void showComputerType()
	{
		System.out.println("Pc");
	}
}


//LAPTOP CLASS IMPLEMENTS COMPUTER INTERFACE
class Laptop implements Computer
{
	//LAPTOP CONSTRUCTOR WHEN OBJECT GETS CREATED DISPLAY MESSAGE
	Laptop()
	{
		System.out.println("Laptop object created");
	}


	@Override
	public void showComputerType()
	{
		System.out.println("Laptop");
	}
}


//SERVER COMPUTER CLASS IMPLEMENTS COMPUTER INTERFACE
class ServerComputer implements Computer
{
	//SERVER COMPUTER CONSTRUCTOR WHEN OBJECT GETS CREATED DISPLAY MESSAGE
	ServerComputer()
	{
		System.out.println("ServerComputer object created");
	}


	@Override
	public void showComputerType()
	{
		System.out.println("Server Computer");
	}
}


//COMPUTER FACTORY METHOD
class ComputerFactory
{
	//MAIN METHOD
	public Computer getInstanceOfComputer(String computerType)
	{
		switch(computerType)
		{
			case "Pc"		:	return new Pc();
			case "Laptop"		:	return new Laptop();
			case "ServerComputer"	:	return new ServerComputer();
			default			:	System.out.println("Please give valid input");
		}
		return null;
	}
}


//FACTORY PATTERN CLASS
public class FactoryPattern
{
	//MAIN METHOD
	public static void main(String[] args)
	{
		//TAKING INPUT FROM USER
		System.out.println("Enter input for computer type (Laptop,Pc and ServerComputer)");
		Scanner scannerObject = new Scanner(System.in);		
		ComputerFactory computerFactoryObject = new ComputerFactory();
		computerFactoryObject.getInstanceOfComputer(scannerObject.next());	
	}
}
