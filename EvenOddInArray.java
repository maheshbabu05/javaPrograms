package java_programs1;

public class EvenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num []={3,4,90,25,14,6,12,3,99,435,76};
		
		for(int i=1; i<num.length;i++) {
			
			if(num[i]%2==0) {
				
				System.out.println("Even is :"  +num[i]);
				
				
			}
			
			else{
				
				System.out.println("odd is :"  +num[i]);
			}
		}

	}

}
