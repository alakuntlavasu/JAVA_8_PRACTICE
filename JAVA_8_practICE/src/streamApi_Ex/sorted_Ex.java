package streamApi_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sorted_Ex {

	public static void main(String[] args) {
	
		List<Integer> number= Arrays.asList(1,4,3,5,2,8,7);
		
	// sorted 
	// natural or assinding order 	
		List<Integer>sortedList=number.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);

	}

}
