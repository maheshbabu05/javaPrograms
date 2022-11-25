   package java_programs1;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= 0;
		int num2 =1;
		int nxtnum;
		int totalnum=5;
		
		// 1) Method using Scanner 
		
		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		totalnum =sc.nextInt();
		sc.close();
		
		// 2) Method using Swap
		
		for (int i=0;i<totalnum;i++) {
			
			System.out.println(num1);
			nxtnum=num1+num2;
			num1=num2;
			num2=nxtnum;
		}
		

	}

}
