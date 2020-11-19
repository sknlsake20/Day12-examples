package com.src;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.minusDays(1));
	}

}
