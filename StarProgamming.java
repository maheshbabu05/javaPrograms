package java_programs1;

import java.util.Scanner;

public class StarProgamming {
	
public static void main(String[] args) {
	
	Scanner Scan = new Scanner(System.in);
	
	System.out.println("enate num of line:");
	
	int NoOfLine=Scan.nextInt();
	
	int row,column=0;
	
	for(row=0;row<NoOfLine;row++) {
		
		
		
		
		for(column=0;column<=row;column++) {
			
			System.out.print("*         ");
			
			
			
			
		}
		
		
		System.out.println();
		
	}
	
	
	
}

}
