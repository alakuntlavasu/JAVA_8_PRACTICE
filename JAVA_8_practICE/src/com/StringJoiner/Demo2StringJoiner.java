package com.StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Demo2StringJoiner {

	public static void main(String[] args) {
		
		List<String> stringJoiner= Arrays.asList("vasu","varun Taj","naveen Kumar","jaggu");
		
		String strings= String.join(" * ", stringJoiner);
		
		System.out.println(strings);

	}

}
