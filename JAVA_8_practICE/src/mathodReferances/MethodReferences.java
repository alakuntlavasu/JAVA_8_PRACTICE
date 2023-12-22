package mathodReferances;

import java.util.function.Function;

public class MethodReferences {

	public static void main(String[] args) 
	{
		
		 Function<String, Integer> lanbdaFunction=(String s)-> Integer.parseInt(s);
		 
	        System.out.println( lanbdaFunction.apply("13"));
	        
	              // (or)
	        
	        Function<String , Integer> referanceFunction= Integer::parseInt;
	        
	        System.out.println(referanceFunction.apply("14"));

	}

}
