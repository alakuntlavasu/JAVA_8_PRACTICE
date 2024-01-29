package Streams_API;

import java.util.ArrayList;
import java.util.List;

public class Streams_API_Intraduction {

	public static void main(String[] args) {
		
//		List<String> names=new ArrayList<String>();
//		names.add("vasu");
//		names.add("sivs");
//		names.add("vamsi");
//		names.add("naveen");
//		
//		// it will get the two objects we will use limit() method
//		names.stream().limit(2).forEach(x->{System.out.println(x);});

		List<String> names=new ArrayList<String>();
		names.add("vasu");
		names.add("sivs");
		names.add("vamsi");
		names.add("naveen");
		names.add("varun");
		names.add("Rajesh");
		
//		// it will skip the two objects we will use skip() method
//		names.stream().skip(2).forEach(g->{System.out.println(g);});
		
		// it use both skip() and limit() 
				names.stream().skip(2).limit(2).forEach(g->{System.out.println(g);});
		
	}

}
 