package org.vb.java.util.tokenizing;

public class TokenEx1 {
	public static void main(String[] args) { 
		String[] tokens = args[0].split(args[1]); 
		System.out.println("count " + tokens.length);   
		for(String s : tokens) 
			System.out.println(">" + s + "<");
	}
}


// java SplitTest "ab5 ccc 45 @" "\d"

// One drawback to using the String.split()  - it process whole file for tokenization
// Scanner class provides a rich API for doing just such on-the-fly tokenization operations

//Scanners can be constructed using files, streams, or Strings as a source.
//Tokenizing is performed within a loop so that you can exit the process at any point.
//Tokens can be converted to their appropriate primitive types automatically

// Scanner is better than Strin.split();


