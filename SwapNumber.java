 package java_programs1;

public class SwapNumber {
	
	public static void main(String[] args) {
		 
		String viratRUN = "Nine";
		String DhoniRUN = "Ten";
				
		
		System.out.println("Before Swapping" + "  V   :" + viratRUN + "  D   :" + DhoniRUN);
				String temp = viratRUN;
				
				viratRUN = DhoniRUN;
				
				DhoniRUN=temp;
				System.out.println("After Swapping" + "  V   :" + viratRUN + "  D   :" + DhoniRUN);
		
	}
	
	
	public static void withoutThird() {
		
		int one = 99;
		int two = 45;
		
		System.out.println("Before Swapping" + "  1   :" + one + "  2   :" + two);
		
		one = one -two;
		two = one +two;
		one = two -one;
		
		System.out.println("AfterSwapping Swapping" + "  1   :" + one + "  2   :" + two);
		
		
		
	}
	public static void main1(String[] args) {
		
		SwapNumber s = new SwapNumber();
		s.withoutThird();
		
		
		
	}
	
	
	

}
