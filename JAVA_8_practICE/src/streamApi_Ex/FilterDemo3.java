package streamApi_Ex;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	double price;
	
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class FilterDemo3 {
	

	public static void main(String[] args) {
		
		
		// one product object List here
		// i want filter the price>25000
		
		List<Product>productList=new ArrayList<Product>();
		
		productList.add(new Product(1, "HP Laptop", 25000));
		productList.add(new Product(2, "Sony Laptop", 30000));
		productList.add(new Product(3, "Lenovo Laptop", 28000));
		productList.add(new Product(4, "APPLE Laptop", 23000));
		productList.add(new Product(5, "DELL Laptop", 90000));
		
		
		productList.stream().filter(p->p.price>25000) // Filtering price
		
		                    .forEach(pr->System.out.println(pr.price));// iterating
		
          
	}

}
