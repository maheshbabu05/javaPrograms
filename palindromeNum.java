package java_programs1;

import java.util.Scanner;

public class palindromeNum {
	
	public static void main(String[] args) {
		
		
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		
		int num =Sc.nextInt();
		
		int original= num;
		
		
		
		
		
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		if(original==rev) {
			
			System.out.println(original +" ispalindrome");
		}
		else {
			
			System.out.println(original +" isNOTpalindrome");
		}
		
		
	}

}
