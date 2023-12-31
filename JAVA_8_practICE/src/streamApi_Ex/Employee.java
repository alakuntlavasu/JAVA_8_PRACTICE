package streamApi_Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
	  private int id;
	  private String name;
	  private int salary;
	  
	public Employee(int id, String name, int salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	  
	public static void main(String[] args)
	{
		
		// data source is List of employee type
		  List<Employee> enames =new ArrayList<Employee>();
		    
	        enames.add(new Employee(101,"vasu",56000));
	        enames.add(new Employee(101,"varun",66000));
	        enames.add(new Employee(101,"madauv",77000));
	        enames.add(new Employee(101,"milon",86000));
	        enames.add(new Employee(101,"madhu",95000));
	        
	        
	       // with stream filter the data 
	        
	        List<Employee> al=enames.stream().filter(ename->ename.getName().startsWith("m"))
	        		                         .collect(Collectors.toList());
	                                           System.out.println(al);
	        		                           
	        
//	        List<Employee> al=new ArrayList<>();
	        
	        enames.stream().filter(ename->ename.getName().startsWith("m")).collect(Collectors.toList());
	        
	        System.out.println(al);
	       
	        
	    // Without Stream filter the data    
	        
	        for(Employee ename:enames) {
	        	
	        	if(ename.getName().startsWith("m")) {
	        		System.out.println(ename);
	        	}
	        }
	     
	       
	        
	}
	
	  
}
