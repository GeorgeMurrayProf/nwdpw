package Lessons;
import java.util.Scanner;

public class Lesson2 { 
	public static void main (String[] args) { 
		
		int x = 7; int age = 30; int minute = 25; int money = 1200; int day = 3;
		
		if(x < 42){
			System.out.println("Hi");
		}
		
		if(age < 0){
			if(age < 16){ //nested if/else statement
				System.out.println("Too young!");
			} else {
				System.out.println("Welcome!");
			}
		} else {
			System.out.println("Error");
		}
		
		if(minute <= 0){ // else if example
			System.out.println("Error");
		} else if(minute <= 16){ //will continue through else if until conditions met
			System.out.println("Too early");
		} else if(minute < 60) {
			System.out.println("It's time!");
		} else {
			System.out.println("Really?");
		}
		
		if (age > 18 && money > 500) { //using logical operators to minimise if statement usage
			System.out.println("Welcome!");
		}
		
		if(!(age > 18)){ //if statements are usually true, using ! makes them false
			System.out.println("Too young");
		} else {
			System.out.println("Welcome!");
		}

		switch(day){ //example switch case
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Weekday");
		}
		
		while(x > 0){ //while loop example
			System.out.println(x);
			x--;
		}
		System.out.println("Loop ended"); //output = 7,6,5,4,3,2,1,0,Loop Ended
		
		for(int i = 1;i <= 5;i++){ //for loop example
			System.out.println(i);
		}
		
		do { // do while loop example
			System.out.println(x);
			x++;
		} while(x < 10);
		
		while(x > 0){
			System.out.println(x);
			if(x == 10){
				break; //break terminates loop and transfers execution to following the statement
			}
			x++;
		} // output = 7,8,9,10 - can see it doesn't add the postfix addition
		
		for(int i=10;i <= 40;i = i + 10){
			if(i == 30){
				continue; //continue resets reiteration back to the begining, skipping the rest if the iteration
			}
			System.out.println(i);
		} // output = 10,20,40
		
		/* Operators
		 * < (less than)
		 * > (greater than)
		 * != (not equal to)
		 * == (equal to)
		 * <= (less than or equal to)
		 * >= (greater than of equal to)
		 */
		
		/* Logical Operators
		 * && (and)
		 * || (or)
		 * ! (not)
		 */
		
		}
	}