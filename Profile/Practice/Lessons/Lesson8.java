package Lessons;


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

	public static void main (String[] args) { 
		
		
			
	}
}