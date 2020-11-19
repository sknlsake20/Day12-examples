package com.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(45,67,2,3,78);
		
		System.out.println(list);
		
		list.stream().flatMap(num->Stream.of(num)).forEach(System.out::println);
		
	}

}
