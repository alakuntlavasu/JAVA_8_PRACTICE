package Stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FruitsEx {

	public static void main(String[] args) {
		
		List<String> fruitsList= Arrays.asList("Apple","Banana","Mango","Orange","Apple","Mango","Grape","Orang");
		
//		List<String> distinctfruits =fruitsList.stream().distinct().collect(Collectors.toList());
		
		fruitsList.stream().distinct().forEach(n->System.out.println(n));
		
		// count
		long count =fruitsList.stream().distinct().count();
		System.out.println(count);
		
		
		//limit
		List<String> fruit =fruitsList.stream().limit(3).collect(Collectors.toList());
		
	     System.out.println(fruit);
		
		fruitsList.stream().limit(3).forEach(n->System.out.println(n));
		

	}

}
