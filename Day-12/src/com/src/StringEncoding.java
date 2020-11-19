package com.src;
import java.util.Base64;
import java.util.Scanner;
public class StringEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		
		
		
		Base64.Encoder encode=Base64.getEncoder();
		
		Base64.Decoder decode=Base64.getDecoder();
		System.out.println("enter a string name");
		
		String uname=encode.encodeToString(name.next().getBytes());
	
		
		System.out.println("encoded value is :"+uname);
		
		
		String strdecode=new String(decode.decode(uname));
		
		System.out.println("decoded value is "+strdecode);
		
		
		
		
	}

}
