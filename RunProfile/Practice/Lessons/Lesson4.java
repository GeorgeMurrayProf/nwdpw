package Practice.Lessons;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson4 { 
	
	static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	static int largerNum(int a, int b){
		if(a > b){
			return a;
		} else if(a >= b){
			return 80085;
		} else {
			return b;
		}
	}
	
	//you can overload methods so they have the same functionality with different return types
	//methods to find max integer variable
	static int max(int a, int b){
		if(a > b){
			return a;
		} else {
			return b;
		}
	}
	//same method but for double variable
	static double max(double a, double b){
		if(a > b){
			return a;
		} else {
			return b;
		}
	}
	//can also expand the method to take additional parameters
	static int max(int a, int b, int c){
		if((a > b) && (a > c)){
			return a;
		} else if((b > a) && (b > c)) {
			return b;
		} else {
			return c;
		}
	}
	
	public static void main (String[] args) { 
		
		sayHello("Greg"); //how to execute a method
		
		ArrayList<String> names = new ArrayList<String>(); //alternate array example
		names.add("David");
		names.add("Eric");
		names.add("Hellen");//an arraylist has to set limit to the amount of elements it can hold
		names.add("Brent");
		
		for(String t: names){ //for each example of calling methods
			sayHello(t);
		}
		
		//unnecessarily large loop to compare which numbers in an multidimensional array are larger
		int[][] numbers = {{10,20},{5,3},{4,4}};
		int ans1 = 0;
		int ans2 = 0;
		
		//iterate through first compartment of array
		for (int i = 0;i < numbers.length; i++){ 
				
			int rot = 1;
	
			//iterate through second compartment of array within first array. REQUIRES ABOVE ITERATION e.g. [i]
			for(int j = 0;j < numbers[i].length; j++){
								
				if(rot == 1){
					ans1 = numbers[i][j]; //save the specific number within the array within a variable
					rot++;
				} else if(rot == 2){
					ans2 = numbers[i][j];
					rot--;
				} else {
					System.out.println("Error");
				}
			} 
			//System.out.println("ans1 = " + ans1 + ", " + "ans2 = " + ans2);
			System.out.println(largerNum(ans1, ans2));
		}
		
		//to call the overloaded methods just input the parameters that align with the method
		max(1,2);
		max(4.5,9.0);
		max(7,4,2);
		
		}
	}