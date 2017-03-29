package Practice.Lessons;

//you can import anything from the JavaAPI using the import keyword
import java.awt.*; //the "*" key is used to import all of the classes within the package
import Practice.Lessons.Lesson6.Person;

/*
 * this is how to create a subclass
 * meaning that Lesson7 will inherit all of Lesson6's properties
 * the superclass should use the access modifier "protected" if it wants its subclasses using the variables
 * 
 * 
 * when a subclass is initiated you must remember that the constructor(s) (if any) of the superclass
 * will be initialised as well
 * 
 * Rules for method overriding:
 * - Must have the same return type
 * - Access modifier cannot be more restrictive (eg. if public, subclass cannot have private, protected)
 * - If a method cannot be inherited, it cannot be overridden
 * - Methods declared "final" or "static" cannot be overridden
 * - Constructors cannot be overridden
 * 
*/
public class Lesson7 extends Lesson6 { 
	
	public void exclaimerOne(){
		System.out.println("No, I am number one!");
	}
	
	//cannot use polymorphism on subclasses from other classes, has to be direct subclass
	public void makeSound(){
		System.out.println("HAHA FOOLS!");
	}

	public static void main (String[] args) { 
		
		//you can do everything that the superclass can do
		//you can also add alternate methods that will only be useful to this subclass
		Person j = new Lesson6().new Person("John");
		j.setAge(20);
		/*
		 * even methods used outside the class "Person" but within the superclass will be accessible to subclasses
		 */
		celebrateBirthday(j);
		System.out.println(j.getAge()); //returns 21
		
		//creating an objects from a subclass / inherited class
		//it's good practice to use the superclass in the initiation
		Lesson6 e = new Lesson7();
		
		e.exclaimerOne(); //returns "No, I am number one!"
		//we can use subclasses from the superclass, however you cannot use polymorphism on them
		j.makeSound(); //returns "Cough"
			
		/*
		 * Upcasting and Downcasting
		 * upcasting is automatic, however downcasting must be done manually.
		 * 
		 * superclasses are mothers
		 * subclasses are children
		 * 
		 * a mother may have many children, but children cannot have more than one mother
		 * superclasses can extend/implement many subclasses
		 * but subclasses can only extend one superclass (interfaces covered in Lesson8)
		 */
		
	}
}