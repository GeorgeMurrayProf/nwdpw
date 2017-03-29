package Practice.Lessons;
import java.util.Scanner;

public class Lesson1 { //public (shows accessability)
	public static void main (String[] args) { //static(can run without creating an instance of class) void(doesn't return a value)
		
		String firstName, secondName;
		firstName = "David";
		secondName = "Williams";
		int age = 32; 
		int month = 12;
		double height = 195.5;	
		char group = 'Z';
		
		int result = age %  month; 
		
		System.out.println(result);// 12 goes into 32 twice, result will show the remainder 8
			
		// prefix / postfix
		int x = 34; //the value of x is incremented to 35, then assigned to y
		int y = ++x; //so both the values are now 35
		
		int a = 34; //the variable's value is used in expression and then increased
		int b = x++; // b is still 34
					// a is assigned to b first, then incremented by 1.
		
		x += a; //x = x + a; =64
		
		System.out.println("My name is " + firstName + " " + secondName); // adding strings is called a concatenation
		
		Scanner myVar = new Scanner(System.in);
		
		/*
		 * + (addition)
		 * - (subtraction)
		 * * (multiplication)
		 * / (division)
		 * % (modulo)
		 * += (addition and assignment)
		 * -= (subtraction and assignment)
		 * */
		
		/* INPUT Methods
		 * byte - nextByte()
		 * short - nextShort()
		 * int - nextInt()
		 * long - nextLong()
		 * float - nextFloat()
		 * double - nextDouble()
		 * boolean - nextBoolean()
		 * complete line - nextLine()
		 * word - next()
		 * */
		
		}
	}