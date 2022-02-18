package com.nishant.staticimport;
import java.util.Arrays;

import static java.util.Arrays.*;

public class FileReader {
	public static void main(String[] args) {
		int[] numbers= {34,76,88,97,22,108};
	//		Arrays.sort(numbers);  works with non static  
		sort(numbers);
		
		System.out.println(numbers[0]);
		
	}

}
