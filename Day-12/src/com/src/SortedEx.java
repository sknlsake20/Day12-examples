package com.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> li= new ArrayList<>();
		
		li.add(98);
		li.add(23);
		li.add(4);
		List li1=(List) li.stream().sorted((i,j)->(Integer)i<(Integer)j?1:-1).collect(Collectors.toList());
		
		System.out.println(li1);
		
		Optional<Integer> min=li.stream().min((i,j)->(Integer)i<(Integer)j?1:-1);
		
		System.out.println(min);
		
		
		

	}
	public void hello()
	{
		System.out.println("hello");
	}

}
