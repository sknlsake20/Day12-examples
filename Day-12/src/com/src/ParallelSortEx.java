//@author: Rajesh

package com.src;

import java.util.Arrays;

public class ParallelSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {5,2,1,8,9};
		
		Arrays.parallelSort(ar);
		
		for(int i:ar)
		{
			System.out.println(i);
		}
		

	}

}
