package java_programs1;

public class ASwapString {
	
	public static void main(String[] args) {
		
		
		String one = "viratKOHLI";
		String two = "18FAV";
		  
		System.out.println("Before Swap :" +one +  " " + two);
		
		one = one + two;
		two = one.substring(0,(one.length()- two.length()));
		one=one.substring(two.length());
		
		System.out.println("After Swap :" +one +  " " + two);
				
				
				
				    
      
		
		
	}

}
