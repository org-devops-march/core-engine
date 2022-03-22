package com.org.app;

/**
 * Hello world!
 *
 */
public class Operations 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int addNumbers(int a, int b) {

		System.out.println( "==Additon==" );
		int c = a+b;
		System.out.println("Additon of 2 numbers "+c );
		return c;

	}

	public int mulNumbers(int a, int b) {

		System.out.println( "==Multiplication==" );
		int c = a*b;
		System.out.println("Multiplication of 2 numbers "+c );
		return c;

	}
}
