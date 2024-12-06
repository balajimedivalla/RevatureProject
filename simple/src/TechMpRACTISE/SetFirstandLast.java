package TechMpRACTISE;

class Employee
{
	private String firstName;
	private String lastName;
	private String ssn;
	
	Employee()
	{
		this.firstName= firstName;
		this.lastName=lastName;
		this.ssn=ssn;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getssn()
	{
		return this.ssn;
	}
	
	public String  validateName(String firstName, String lastName)
	{
		try {
		if(firstName == null || lastName == null)
		{
			throw new  NullPointerException("Entry Missing");
		}
		if(firstName.length()==0 || lastName.length()==0)
		{
			throw new StringIndexOutOfBoundsException("Index out of bound");
			
		}
		
		if(Character.isDigit(firstName.charAt(0)) || Character.isDigit(lastName.charAt(0)))
		{
			throw new IllegalArgumentException("First Character is Invalid");
		}
		
		
		return "Valid String";
		}
		 catch (NullPointerException e) {
	            return e.getMessage();
	        } catch (StringIndexOutOfBoundsException e) {
	            return e.getMessage();
	        } catch (IllegalArgumentException e) {
	            return e.getMessage();
	        }
}
	  public String validateSsn(String ssn) {
	        if (ssn != null && ssn.length() > 1 &&
	            Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(ssn.length() - 1))) {
	            return "Valid String";
	        }
	        return "Invalid String";
	    }
}
public class SetFirstandLast {
	
	public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.validateName(null, null)); 
        System.out.println(emp.validateName("", "")); 
        System.out.println(emp.validateName("1John", "Doe")); 
        System.out.println(emp.validateName("John", "Doe")); 

      
        System.out.println(emp.validateSsn("12345"));

        System.out.println(emp.validateSsn("A2345"));

}
	
}
