package Lessons;

public class Lesson5 { 
	
		//public is an access modifier, it is used to limit access to classes, attributes and methods.
		
		/*
		 * the available modifiers for classes are:
		 * public - the class is accessible by any other class
		 * default (left blank) - only accessible by classes in the same package
		 */
		
		/*
		 * the available modifiers for methods shown in the diagram below:
		 * 
		 * Modifier   | Class | Package | Subclass | World |
		 * public     |   Y   |    Y    |    Y     |   Y   | - Accessible from any other class
		 * protected  |   Y   |    Y    |    Y     |   N   | - Same as default, however also allows access to subclasses
		 * default    |   Y   |    Y    |    N     |   N   | - Accessible from any class in the same package 
		 * private    |   Y   |    N    |    N     |   N   | - Accessible only within the declared class itself
		 * 
		 *
_____________________________________________________________________________________________________________________
		
		 *
		 * Constructors are special methods invoked when an object is created and are used to initialise them
		 * they can be used to provide initial values for object attributes
		 * 
		 * they must have:
		 * - a name that is the same as its class name
		 * - have no explicit return type
		 *
		 */
	
	 	public class Table{
	 		private String material;
	 		private String colour;
	 		private int price;
	 		
		 		//you can have multiple constructors
		 		Table(int c, String d){
		 			material = "Oak"; //all objects of "Table" will automatically have their material set to Oak
		 			price = c; //price will need to take parameters to initialise the attribute
		 			this.setColour(d);
		 		}
		 		
		 		
		 		Table(){
		 			this.setColour("Red");
		 		}
	 		
			//Getters start with get, followed by the variable name with the first letter capitalised 
			public String getColour(){
				return colour;
			}
			
			//Setters are similar to Getters, except that they require an input type
			public void setColour(String c){
				this.colour = c;
			}	 		
	 	}	
	
	public static void main (String[] args) { 
		
		//the constructor is called when you create an object using the new keyword
		//remember which attribute(s) to set when creating a new object
		Table v1 = new Lesson5().new Table(150, "Red"); //this is how you call a subclass of a class
		Table v2 = new Lesson5().new Table();
		v2.setColour("Green"); //you can always change the preset colour after initialisation
		System.out.println(v1.getColour() + " " + v2.getColour()); //returns "Red Green"
		
		}
	}