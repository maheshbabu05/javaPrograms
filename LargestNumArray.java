package java_programs1;

public class LargestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numberS[]= {1,-50,88,13232,76,-90};
		int largest = numberS[0];
		int smallest = numberS[0];
		
		// i=1 because 0 already initialized to store the 1st data in array
		
		for(int i =1; i<6;i++) {        // i<6 bacuse in array we have 6 data
			
			if(numberS[i]>largest) {
				
				largest=numberS[i];
			}
				
//				else if(numberS[i]<smallest){
//					smallest = numberS[i];
//				}
				
			
		}
		
		
		System.out.println("largest number is : "     +largest);
		System.out.println("smallest number is : "     +smallest);
		

	}

}
