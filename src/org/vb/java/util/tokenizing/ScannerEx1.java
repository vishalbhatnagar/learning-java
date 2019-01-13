
package org.vb.java.util.tokenizing;

import java.util.Scanner;

class ScannerEx1 {
	public static void main(String[] args) {
		System.out.print("input: "); 
		System.out.flush();   
		try {    
			Scanner s = new Scanner(System.in);
			String token;    
			do {      
				token = s.findInLine(args[0]); 
				System.out.println("found " + token);   
			} while (token != null);  
		} catch (Exception e)
		{ System.out.println("scan exc"); }
	}
}

// pass it in command line aggument
//java ScanIn "\d\d"
//input: 1b2c335f456 