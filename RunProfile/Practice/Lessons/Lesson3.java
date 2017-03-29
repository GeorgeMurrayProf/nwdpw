package Practice.Lessons;
import java.util.Scanner;

public class Lesson3 { 
	public static void main (String[] args) { 
		
		int[] arr = new int[5]; //creates an array of 5 element integers
		System.out.println(arr.length); //shows the number of elements it stores
		
		String[] myNames = {"A", "B", "C", "D"}; //when you know the values you can create an array literal
		
		
		int[] myArr = {6, 42, 3, 7};
		int sum = 0;
		
		for(int x = 0;x < myArr.length; x++){
			sum += myArr[x]; //addition and assignment to sum
		} //goes through the length of the array adding all elements to sum
		
		for(int t: myArr){ //within each iteration t will equal the element of the array
			System.out.println(t);
		} //for each loop that traverses all the elements of an array to execute the same function
		
		//Multidimensional arrays
		int[][] sample = {{1,2,3}, {4,5,6}};
		System.out.println(sample[1][0]); // to access a two dimensional array need index for array
		//and then the element in that array
		sample[0][0] = 42; //you can set array elements
		int x = sample[1][0]; //and also get them to store in variables
		
		
		
		}
	}