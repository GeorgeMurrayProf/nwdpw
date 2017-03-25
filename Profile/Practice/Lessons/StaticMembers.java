package Lessons;

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
			
	}
}