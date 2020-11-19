
package com.src;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		
		System.out.println("enter number of values to be accepted now: ");
		int n=name.nextInt();
		TreeSet<Double> ts=new TreeSet<>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter double values :");
			
			
				ts.add(name.nextDouble());
			
		}
		
		System.out.println(ts);
		Double d=3.0;
		
		HashSet ts1= (HashSet) ts.stream().filter((t)-> (Double)t<d).collect(Collectors.toSet());
		
		System.out.println(ts1);
		
	}

}
