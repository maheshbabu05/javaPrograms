package java_programs1;

public class BDuplicateString {
	
	
	public static void main(String[] args) {
		
		String look = "BOOKkeepER";
		
		int length = look.length();
		char[] cha = look.toCharArray();
		
		
		for(int i=0; i<length;i++){
			
			for(int j= 1+i;j<length;j++) {
				
				if (cha[i]==cha[j]) {
					
					System.out.println("dupicate values are:    " + cha[j])  ;
				}
				
				
			}
			
			
		}
		
	}

}
