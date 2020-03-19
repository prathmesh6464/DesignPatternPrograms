package PrototypeDesignPattern;
import java.util.ArrayList;
import java.util.List;

class Employees implements Cloneable
{
	private List<String> empList;
	
	public Employees()
	{
		empList = new ArrayList<String>();
	}
}