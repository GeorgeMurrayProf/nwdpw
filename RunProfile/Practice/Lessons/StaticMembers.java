package Practice.Lessons;

public class StaticMembers { 
	
	 /* - STATIC
	 * when you declare a variable or method as static, it belongs to the class, rather than to a specific instance.
	 * which means only one instance of that static variable exists
	 * meaning the variable is shared with all objects
	 * 
	 * static variables can only be created within a static class
	 */
	public static int COUNT = 0;
	
	//the keyword "final" represents a constant, and constants are always typed in CAPITALS
	public static final double PI = 3.14;
	
	/*
	 * an enum is a way to define collections of constants
	 * enums should be used when a variable (especially a method parameter) can only take one value out of a set of values
	 * using enum instead of integer or string increases compile time checking and avoid errors from passing invalid constants
	 * meaning you document which values are legal to use
	 */
	enum Difficulty{
		Low,
		Medium,
		High
	}
	
	StaticMembers(){
		COUNT++;
	}
	
	
	public static void dbl(){ 
		System.out.println("Beep");
	}
	
	public static void main (String[] args) { 

		StaticMembers j = new StaticMembers();
		StaticMembers k = new StaticMembers();
		
		//when calling the COUNT variable from outside the class
		System.out.println(StaticMembers.COUNT);
		//can use the COUNT variable within the class
		System.out.println(COUNT);
		
		//you can refer to enum constants with the dot syntax
		Difficulty a = Difficulty.Low;
		
		//it is possible to check corresponding enum values, for example with a switch statement
		switch(a){
		case Low:
			System.out.println("Difficulty is Low");
			break;
		case Medium:
			System.out.println("Difficulty is Medium");
			break;
		case High:
			System.out.println("Difficulty is High");
			break;
		}
		//unlike objects, equals() can be used on enum values
			
	}
}