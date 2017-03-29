package Practice.Lessons;


public class Lesson9 { 
	
	/*
	 * each object has a predefined equals() method that is used for semantical testing
	 * to make it work for class objects it must be overridden
	 */
	
	String test;
	
	Lesson9(String t){
		test = t;
	}
	
	//override hashCode()
	@Override 
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((test == null) ? 0 : test.hashCode());
		return result;
	}
	
	//override semantic equals()
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Lesson9 other = (Lesson9) obj;
		if(test == null){
			if(other.test != null)
				return false;
		} else if(!test.equals(other.test))
			return false;
		return true;
	}
	
	public static void main (String[] args) { 
		
		//now when we compare the objects they are found to be the same
		Lesson9 t1 = new Lesson9("test");
		Lesson9 t2 = new Lesson9("test");
		System.out.println(t1.equals(t2));
		
	}
}