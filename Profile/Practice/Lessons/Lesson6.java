package Lessons;

public class Lesson6 { 
	
		/*
		 * Value types are the basic type, which include:
		 * byte
		 * short
		 * int
		 * long
		 * float
		 * double
		 * boolean
		 * char
		 */
	
		public void exclaimerOne(){
			System.out.println("I am number one!");
		}
	
		public class Person{
			private int age;
			private String name;
			
				public int getAge(){
					return age;
				}
				
				public void setAge(int a){
					this.age = a;
				}
				
				public String getName(){
					return name;
				}
				
				public void setName(String n){
					this.name = n;
				}
				
			Person(String n){
				this.setName(n);
			}
			
			public void makeSound(){
				System.out.println("Cough");
			}
			
		}
		
		
		
	
	public static void main (String[] args) { 
		
			/*
			 * A reference type stores a reference (or address) the the memory location where
			 * the corresponding data is stored
			 * there are also reference types for Strings & Arrays
			 * the object of Person is referenced here as j
			 */
			Person j = new Lesson6().new Person("John");
			j.setAge(20);
			celebrateBirthday(j);
			System.out.println(j.getAge()); //returns 21
			
			/* 
			 * WHEN WANTING TO USE THE JAVA MATH CLASS USE: 
			 * 
			 * - 	javap java.Math 	-
			 * 
			 * in the command promt to check all the methods used within the class
			 */
		
		}
		
	/*
	 * can create and use methods for classes outside of the class
	 * 
	 * the method celebrateBirthday() takes a Person object as its parameter
	 * because j is the reference type, the method affects the object itself
	 * 
	 * use static because birthdays can represent nothing other that +1 more year, type does not change
	 */
		static void celebrateBirthday(Person p){
			p.setAge(p.getAge() + 1);
		}
	}