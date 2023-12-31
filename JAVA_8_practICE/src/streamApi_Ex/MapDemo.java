package streamApi_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
	
   
		List<String> vehicles=Arrays.asList("bus","car","airoplan","trian","rapido");
		
		List<String>vehicleUpercaseList=new ArrayList<String>();
		
		
	// Without Stream
		
		/*for(String vname:vehicles) {
		
			
			vehicleUpercaseList.add(vname.toUpperCase());
			
			
		}
		System.out.println(vehicleUpercaseList);*/
		
		// With Stream
		
		vehicleUpercaseList =vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehicleUpercaseList);
	}

}
