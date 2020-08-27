import java.util.*;
public class Department {
	private Scanner sc;
	private List<Employee> empList;
    int depcode;
    String depname;
    String city;
    int recordNum;
    
    public Department()
    {
    	sc= new Scanner(System.in);
    	empList= new ArrayList<Employee>();
    	System.out.println("How many Employee's record want to type in?");
    	recordNum=sc.nextInt();
    	
    }
    
    public void get()
    {
    	for(int i=1; i<= recordNum; i++);
    	{
    		
    		System.out.println("Department Code: ");
    		depcode=sc.nextInt();
    		System.out.println("Department Name: ");
    		depname=sc.next();
    		System.out.println("City: ");
    		city=sc.next();
    		
    		Employee emp=new Employee();    		
    		System.out.println("Enter Employee Code: ");
    		emp.setEmpcode(sc.nextInt());
    		System.out.println("Enter Employee Name: ");
    		emp.setEmpname(sc.next());
    		System.out.println("Enter salary: ");
    		emp.setSalary(sc.nextDouble());
    		empList.add(emp); // Need to have this to add data into the display List
    	}
    }


    public void display()
    {
    	for (Employee e:empList)
    	{
    		System.out.println("Employee ID is - " + e.getEmpcode());
    		System.out.println("Employee name is - " + e.getEmpname());
    		System.out.println("Salary - " + e.getSalary());
    	}
    }
    
    public static void main(String args[])
    {
    	Department dep = new Department();
    	dep.get();
    	System.out.println();
    	System.out.println("Collection of only Employee information");
    	dep.display();
    }
}
