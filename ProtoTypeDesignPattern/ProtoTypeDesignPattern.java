package ProtoTypeDesignPattern;
import java.util.ArrayList;
import java.util.List;


//CLASS EMPLOYEE IMPLEMENTS CLONEABLE INTERFACE
class Employee implements Cloneable
{
	//EMPLOYEE LIST VARIABLE
	private List<String> empList = new ArrayList<String>();

	
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
	public Object clone() throws CloneNotSupportedException
	{
		List<String> temparoryCloneObject = new ArrayList<String>();
		for (String employeeName : (ArrayList<String>)this.getEmployeeList()) 
		{
			temparoryCloneObject.add(employeeName);
		}
		return temparoryCloneObject;
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
		employeeObject.setEmployeeList("pratik");
		Object emp = employeeObject.getEmployeeList();
		System.out.println(emp);
		
		
		//SECOND OBJECT CREATED FOR CLONING
		Object emp2 = employeeObject.clone();
		System.out.println(emp2);
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
	}
}


