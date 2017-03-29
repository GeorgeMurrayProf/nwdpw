package Practice.Lessons;


/*
 * Abstract Classes & Interface Classes are both a type of abstraction
 * you use the word "extends" to inherit from an abstract class
 * you use the word "implements" to inherit from an interface
 * 
 * Abstract Classes:
 * - cannot be instantiated (cannot create object of that type)
 * - need to be inherited to be able to use
 * - any class that contains an abstract method should be defined as abstract
 * 
 * 
 * Interface Classes:
 * - may contain only static final variables
 * - cannot contain a constructor, because cannot be instatiated
 * - interfaces can extend other interfaces
 * - a class can implement any number of interfaces
 * - you do not need to use the abstract keywork as interfaces are implicitly abstract
 * - methods in interfaces are implicitly public
 * - when implementing an interface, you must override all its methods
 */

public class Lesson8 { 
	
	//when creating an abstract class
	abstract class Animal {
		int legs = 0;
		abstract void makeSound(); //able to define methods but with no function as of yet
	}
	
	//when creating an interface
	interface Vehicle {
		public void move();
		public void makeSound();
	}
	
	//using a nested class within the constructor
		int id;
		Lesson8(int i){
			id = i;
			privClass p = new privClass();
			p.think();
		}
		
		/*
		 * Anonymous Classes
		 * this is a way of extending classes on the fly
		 */
		
		public void start(){
			System.out.println("Starting...");
		}
		
		/*
		 * Inner Classes
		 * java supports nesting classes, which is a class within a class
		 * unlike a class a nested class can be private, meaning it can't be accessed out of the class
		 */
		
		private class privClass {
			public void think(){
				System.out.println(id + " is thinking...");
			}
		}

	public static void main (String[] args) { 
		
		int i = 80085;
		
		/*
		 * when creating an object of the Lesson9 class
		 * we add () to the end of new object
		 * this only changes the method for this specific object
		 * any other object made of Lesson9 will not have this change implemented
		 * 
		 * "i" is from nested class constructor
		 */
		Lesson8 l8= new Lesson8(i){
			//the @Override is "invisible"
			@Override public void start(){
				System.out.println("This is Changed");
			}
				
		}; //not that ";" is required at the end bracket when extending a class
		l8.start();
			
	}
}