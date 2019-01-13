package org.vb.java.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		// zero-based indexes

		Pattern p = Pattern.compile("ab");      // the expression
		Matcher m = p.matcher("abaaaba");       // the source
		while(m.find()) {      System.out.print(m.start( ));   
		}
		//In general, a regex search runs from left to right,
		//and once a source's character has been used in a match, it cannot be reused. 

		//meta characters \d \s \w
		//\d A digit \s A whitespace character \w A word character (letters, digits, or "_" (underscore))
		System.out.println("\n");
		Pattern p2 = Pattern.compile("\\d");      // the expression
		Matcher m2 = p2.matcher("a12c3e456f");       // the source
		while(m2.find()) {      System.out.print(m2.start( ));   
		}

		System.out.println("\n");
		Pattern p3 = Pattern.compile("\\w");      // the expression
		Matcher m3 = p3.matcher("a 1 56 _Z");       // the source
		while(m3.find()) {      System.out.print(m3.start( ));   
		}

		System.out.println("\n");
		Pattern p4 = Pattern.compile("\\s");      // the expression
		Matcher m4 = p4.matcher("a 1 56 _Z");       // the source
		while(m4.find()) {      System.out.print(m4.start( ));   
		}

		//square brackets and a dash
		//[abc] Searches only for a's, b's or c's
		//[a-f]	Searches only for a, b, c, d, e, or f characters
		//[a-fA-F]    Searches for the first six letters of the alphabet, both cases.
		System.out.println("\n");
		Pattern p5 = Pattern.compile("[a-cA-C]");      // the expression
		Matcher m5 = p5.matcher("cafeBABE");       // the source
		while(m5.find()) {      System.out.print(m5.start( ));   
		}

		//"^" to negate the characters specified,
		//nested brackets to create a union of sets,
		//and "&&" to specify the intersection of sets
		
		// hexadecimal numbers
		System.out.println("\n");
		Pattern p6 = Pattern.compile("0[xX][0-9a-fA-F]"); // the expression 0[xX][0-9a-fA-F]
		Matcher m6 = p6.matcher("12 0x 0x12 0Xf 0xg"); // the source
		while(m6.find()) { System.out.print(m6.start( ));   
		}
		
		// Quantifiers 
		// + one or more 
		//* Zero or more occurrences 
		//? Zero or one occurrence
		// . predefined dot -  any character can serve here
		
		//\d+ one or more digit
		System.out.println("\n");
		Pattern p7 = Pattern.compile("0[xX][0-9a-fA-F]"); // the expression 0[xX][0-9a-fA-F]
		Matcher m7 = p7.matcher("1 a12 234b"); // the source
		while(m7.find()) { System.out.print(m7.start( ));   
		}
		
		System.out.println("\n");
		Pattern p8 = Pattern.compile("0[xX]([0-9a-fA-F])+"); // the expression 0[xX][0-9a-fA-F]
		Matcher m8 = p8.matcher("1 a12 234b"); // the source
		while(m8.find()) { System.out.print(m8.start( ));   
		}
		
		//[^abc]
		// find anything but not  a's, b's, or c's in a file 
		//You want to create a list of all the files whose names start with proj1
		//"give me zero or more characters that aren't a comma
		System.out.println("\n");
		Pattern p9 = Pattern.compile("proj1([^,])*"); // the expression 0[xX][0-9a-fA-F]
		Matcher m9 = p9.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java"); // the source
		while(m9.find()) { System.out.print(m9.start( ));   
		}
		
		// ?
		//that if we find either seven digits in a row, 
		//or three digits followed by a dash or 
		//a space followed by 4 digits
		//1234567
		//123 4567
		//123-4567
		//zero or one instance of either a space or a dash
		System.out.println("\n");
		Pattern p10 = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d"); 
		Matcher m10 = p10.matcher("1234567890w323");
		while(m10.find()) { System.out.print(m10.start( ));   
		}
		
		System.out.println("\n");
		Pattern p11 = Pattern.compile("a.c"); 
		Matcher m11 = p11.matcher("ac abc a c" );
		while(m11.find()) { System.out.print(m11.start( ) +" "+ m11.group());   
		}
		
		//Greedy Quantifiers 
		//"greedy", "reluctant", or "possessive"
		//The greedy quantifier does in fact read the entire source data,
		// and then it works backward (from the right) until it finds the rightmost match
		System.out.println("\n");
		Pattern p12 = Pattern.compile(".*xx"); 
		Matcher m12 = p12.matcher("yyxxxyxx" );
		while(m12.find()) { System.out.print(m12.start( ) +" "+ m12.group());   
		}
		
		//we're now using the reluctant qualifier *? by using ?
		System.out.println("\n");
		Pattern p13 = Pattern.compile(".*?xx"); 
		Matcher m13 = p13.matcher("yyxxxyxx" );
		while(m13.find()) { System.out.print(m13.start( ) +" "+ m13.group());   
		}
		
		//When Metacharacters and Strings Collide
		//String pattern = "\d";    // compiler error!
		//String pattern = "\\d";    // a compilable metacharacter

		String a1 = ".";// regex sees this as the "." metacharacter 
		//String a2 = "\."; // the compiler sees this as an illegal Java escape sequence
		String a3 = "\\."; // the compiler is happy, and regex sees a dot, not a metacharacter
		
		//Matcher methods -appendReplacement(), appendTail(), and replaceAll()
		
		// subsets of your source data - regions
		//
		
		System.out.println("\n");
		Pattern p14 = Pattern.compile("\\d*"); 
		Matcher m14 = p14.matcher("ab34ef" );
		while(m14.find()) { System.out.print(m14.start( ) +" "+ m14.group());   
		}
		

		
		
		
		
		
		
		
		
		
		
		
		




	}

}
