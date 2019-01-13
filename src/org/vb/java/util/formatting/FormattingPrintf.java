package org.vb.java.util.formatting;

public class FormattingPrintf {
	// The format() and printf() methods were added to java.io.PrintStream in Java 5. 
	// Behind the scenes,the format() method uses the java.util.Formatter
	// formatting data will always start with a percent sign (%)
	public static void main(String[] args) {
		System.out.printf("%2$d  +  %1$d", 123, 456);
		//%[arg_index$][flags][width][.precision]conversion char


		//arg_index An integer followed directly by a $, indicates position
		//flags
		//" -" Left justify this argument 
		// "+" Include a sign (+ or -) with this argument
		//"0" Pad this argument with zeroes
		//"," Use locale-specific grouping separators (i.e., the comma in 123,456) 
		// "(" Enclose negative numbers in parentheses
		// width - minimum number of characters to print
		//precision -  precision indicates the number of digits to print after the decimal point
		// conversion - 
		//b boolean 
		// c char 
		// d integer 
		// f floating point 
		// s string

		int i1 = -123; int i2 = 12345; 
		System.out.printf(">%1$(7d< \n", i1);
		System.out.printf(">%0,7d< \n", i2);
		System.out.format(">%+-7d< \n", i2); 
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
		
		System.out.format("%d", 12.3);//Exception in thread "main" 
		//java.util.IllegalFormatConversionException: d != java.lang.Double

		
	}



}
