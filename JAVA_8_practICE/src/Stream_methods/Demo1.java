package Stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {
	
		
		List<String> stringList= Arrays.asList("A","B","c","1","2","3");
		
		// reduce
		Optional<String> b=stringList .stream().reduce((valu1,combine)->{return valu1+combine;});
		System.out.println(b.get());
													

	}

}
