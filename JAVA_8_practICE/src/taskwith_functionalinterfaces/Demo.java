package taskwith_functionalinterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	
	String ename;
	int salary;
	String gender;
	
	public Employee(String ename, int salary, String gender) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
	
	
}
public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<>();
		
		empList.add(new Employee("vasu",50000,"Male"));
		empList.add(new Employee("varun",3000,"Male"));
		empList.add(new Employee("naveen",2000,"Male"));
		empList.add(new Employee("Rajesh",6000,"Male"));
		
		// using stream
		empList.stream().count();
						
			
		
			
			/**
		
		// Function
		Function<Employee, Integer> f=emp->emp.salary*10/10;
		
		// predicate
		
		Predicate<Integer> p=b->b>=5000;
		
		// consumer
		Consumer<Employee> c=s->{
			                     System.out.println("Employee name: "+s.ename);
//			                     System.out.println(s.gender);
			                     System.out.println("Employee salary: "+s.salary);
			                     };

			  for(Employee e:empList) {
				  
				  int bonus=f.apply(e);
//				  System.out.println(bonus);
				  
				  if(p.test(bonus)) {
					  c.accept(e);
					  System.out.println("Employee bonus: "+bonus);
					  
				  }
			  }      
			  
			              */
	}

}
