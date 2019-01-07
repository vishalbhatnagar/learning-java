package org.vb.java.util.formatting;

public class FormattingEx1 {

	public static void main(String[] args) {
		 //java.util.Formatter
		// printf() and format() methods
		// syntax %[arg_index$][flags][width][.precision]conversion char(b,c,d,f,s)
		
		System.out.printf("%2$d + %1$d \n", 123, 456); //456 + 123
		
		int i1 = -123;
		int i2 = 12345;
		System.out.printf(">%1$(7d< \n", i1);
		System.out.printf(">%0,7d< \n", i2);
		System.out.format(">%+-7d< \n", i2);
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
		
	}

}
