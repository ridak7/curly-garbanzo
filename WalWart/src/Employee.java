
public abstract class Employee
{
	private String firstname;
	private String lastname;
	
	public Employee(String fn, String ln)//Constructor Method
	{
		firstname = fn;
		lastname = ln;
	}
	
	public String toString() //Prints employee object
	{
		return(firstname + " " + lastname); //must always return something, if no return needs a void
	}
	
	abstract double pay(double period);
	
	
} 
