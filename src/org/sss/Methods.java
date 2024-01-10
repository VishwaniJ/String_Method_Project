package org.sss;


public class Methods {
	
	public static void main(String[] args) {
		
	   String a="Java Program@1254";
	   String a1="Java Program@1254";
		
	   char ac = a.charAt(3);
	   System.out.println("Charat method "+ ac);
	   
	   int cc = a.indexOf("o");
	   System.out.println("Indexof method " + cc);
	   
	   String bb = a.toUpperCase();
	   System.out.println("touppercase method " + bb);
	   
	   String dd = a.toLowerCase();
	   System.out.println("tolowercase method " + dd);
	   
	   boolean ee = a.isEmpty();
	   System.out.println("isempty method "+ ee);
	   
	   boolean oo = a.startsWith("J");
	   System.out.println("startwith method " + oo);
	   
	   boolean end = a.endsWith("a");
	   System.out.println("endwith method "+end);
	   
	  int i = a.length();
	   System.out.println("length "+ i);
	   
		String trim = a.trim();
		System.out.println("trim "+ trim);
		
		
		
	}
	
	
	

}
