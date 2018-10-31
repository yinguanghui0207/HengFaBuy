package com.xunqi.tool;

public class RandomSixnum { 
	 public static int generateCheckPass() 
	 { 
	 String chars ="1234567891"; 
	 char[] rands = new char[8]; 
	 for (int i = 0; i <8; i++) 
	 { 
	 int rand = (int) (Math.random() * 10); 
	 rands[i] = chars.charAt(rand); 
	 } 
	 String a = new String(rands);
	 
	 return Integer.parseInt(a); 
	 }
	 /*
	 public static void main(String[] args) {
		System.out.println(RandomSixnum.generateCheckPass());
	}*/
}
