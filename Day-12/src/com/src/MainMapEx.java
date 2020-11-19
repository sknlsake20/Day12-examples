package com.src;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
public class MainMapEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of employees :");
		int number=sc.nextInt();
		HashSet<Employee> hs=new HashSet<>();
		for(int i=0;i<number;i++)
		{
			System.out.println("enter employee id :");
			int id= sc.nextInt();
			System.out.println("enter employee name :");
			String name=sc.next();
			System.out.println("enter employee address :");
			String add=sc.next();
			System.out.println("Enter employee salary : ");
			double d= sc.nextDouble();
			
			Employee e=new Employee(id,name,add,d);
			
			hs.add(e);
			
			
		}
		
		System.out.println(hs);
		
		Set s=hs.stream().map((e)->e.salary+5000.0).collect(Collectors.toSet());
		
		System.out.println(s);
		
	}

}
