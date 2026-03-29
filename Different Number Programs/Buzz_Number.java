
import java.util.Scanner;

class Buzz_Number{
	public static void main(String[] args){
		
		for( ; ; ){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		if(num%7==0 || num%10 == 7){
			System.out.println("Given number is Buzz Number");
			System.out.println(" ");
		}
		else{
			System.out.println("Given number is Not a Buzz Number");
			System.out.println(" ");
		}
		
		}
	}
}