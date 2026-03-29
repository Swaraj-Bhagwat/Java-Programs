
import java.util.Scanner;

class Neon_Number{
	public static void main(String[] args){
		
		for( ; ; ){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		int sqr = num * num ;
		int digit ;
		int sum = 0;
		while(sqr > 0){
			digit = sqr%10;
			sum = sum + digit;
			sqr = sqr/10;
			
		}
		
		if (sum == num){
			System.out.println(" Number is Neon number");
			System.out.println(" ");
		}
		else{
			System.out.println("Number is not a Neon Number");
			System.out.println(" ");
		}
		}
	}
}