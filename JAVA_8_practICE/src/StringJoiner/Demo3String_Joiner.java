package StringJoiner;

import java.util.Arrays;
import java.util.List;

public class Demo3String_Joiner {

	public static void main(String[] args) {
		
		String languages= String.join("_", "java","phython","css","HTML");
		
		System.out.println(languages);
		
		
		List<String> listlanguages= Arrays.asList("java","HTML","css","Net");
		
		languages = String.join(" , ",listlanguages );
		
		System.out.println(languages);
		System.out.println("string joiner class in java 8");
		
		

	}

}
