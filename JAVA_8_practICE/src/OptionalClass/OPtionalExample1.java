package OptionalClass;

import java.util.Optional;

public class OPtionalExample1 {

	public static void main(String[] args) {
		
		String names[]=new String[10];
		
//		names[2]=null;
		
		Optional<String> name= Optional.ofNullable(names[2]);
		
		String name1= names[2].toUpperCase();
		
		System.out.println(name1);
//		System.out.println(name);
		

	}

}
