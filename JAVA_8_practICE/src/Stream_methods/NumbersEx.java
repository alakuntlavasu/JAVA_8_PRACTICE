package Stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumbersEx {

	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7);
		
		// max()
		Optional<Integer> f =numbers.stream().max((val1,val2)->{return val1.compareTo(val2);});
		
    System.out.println(f.get());
    
    // min()
    Optional<Integer> g =numbers.stream().min((val1,val2)->{return val1.compareTo(val2);});
	
    System.out.println(g.get());
	}

}
