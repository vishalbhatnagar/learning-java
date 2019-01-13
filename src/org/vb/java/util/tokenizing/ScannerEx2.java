package org.vb.java.util.tokenizing;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String [] args) {
		// Scanner's default delimiter is whitespace
		boolean b2, b;
		int i;   
		String s, hits = " ";
		Scanner s1 = new Scanner(args[0]);
		Scanner s2 = new Scanner(args[0]);
		while(b = s1.hasNext()) { 
			s = s1.next();  
			hits += "s"; 
		}    
		while(b = s2.hasNext()) { 
			if (s2.hasNextInt()) { 
				// methods for every primitive type except char. 
				i = s2.nextInt();  
				hits += "i";  
			} 
			else if (s2.hasNextBoolean()) { 
				b2 = s2.nextBoolean();  hits += "b";   
			} 
			else {     
				s2.next();
				hits += "s2";    
			}   
		} 
		System.out.println("hits " + hits);  
	}
}
