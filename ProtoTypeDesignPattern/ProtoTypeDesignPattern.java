package ProtoTypeDesignPattern;
import java.util.ArrayList;
import java.util.List;


//CLASS EMPLOYEE IMPLEMENTS CLONEABLE INTERFACE
class Employee implements Cloneable
{
	//EMPLOYEE LIST VARIABLE
	private List<String> empList = new ArrayList<String>();

	
	//PARAMETERISED CONSTRUCTOR
	public Employee(List<String> temparoryCloneObject)
	{
		this.empList = temparoryCloneObject;
	}


	//DEFAULT CONSTRUCTOR
	public Employee(){}


	//GETTER METHOD
	public Object getEmployeeList() 
	{
		return (Object)empList;
	}

	
	//SETTER METHOD
	public void setEmployeeList(String empList) {
		this.empList.add(empList);
	}
	
	
	//OVERRIDING METHOD OF OBJECT CLASS
	@Override
	public Employee clone() throws CloneNotSupportedException
	{
		List<String> temparoryCloneObject = new ArrayList<String>();
		for (String employeeName : (ArrayList<String>)this.getEmployeeList()) 
		{
			temparoryCloneObject.add(employeeName);
		}		
		//ONE EXTRA NAME ADDED FOR CHEKING
		temparoryCloneObject.add("Amir Khan");
		return new Employee(temparoryCloneObject);
	}
}


//CLASS PROTO TYPE DESIGN PATTERN
public class ProtoTypeDesignPattern
{
	//MAIN CLASS
	public static void main(String args[]) throws CloneNotSupportedException
	{
		//FIRST OBJECT CREATED
		Employee employeeObject = new Employee();
		employeeObject.setEmployeeList("prathamesh");
		employeeObject.setEmployeeList("pratham");
		employeeObject.setEmployeeList("dvitiya");
		employeeObject.setEmployeeList("tritiya");
		Object employeeList1 = employeeObject.getEmployeeList();
		System.out.println(employeeList1);
		
		
		//SECOND OBJECT CREATED FOR CLONING
		Employee employeeList2 = employeeObject.clone();
		System.out.println(employeeList2.getEmployeeList());
		
		
		//DIFFERENT HASH CODE SHOWN
		System.out.println(employeeList1.hashCode());
		System.out.println(employeeList2.hashCode());
	}
}


