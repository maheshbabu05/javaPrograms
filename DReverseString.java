package java_programs1;

public class DReverseString {
	
	// Using  Buffer
	 
	
	public static void main (String[]  args){
		
		String name= "mahesh";
		
		StringBuffer B = new StringBuffer();
		
		B.append(name);
		
		System.out.println(B.reverse());
		
		
		// Using Array
		
		char[] charary = name.toCharArray();
		
		String Rev ="ertyu";
		for(int  i =charary.length-1; i>=0; i-- ) {
			
			Rev =Rev+charary[1];
			  
		}
		System.out.println(Rev);
	}
	
	
	

}
