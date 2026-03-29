
import java.util.Scanner;

//check whether given number is fibonacci number or not

class Fibonacci_Number{
	public static void main(String[] args){
		
		for( ; ; ){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int n1 = 0, n2 = 1, ans = 0;
		
		while(true){
			ans = n1 + n2;
			
			if(n1 == num){
				System.out.println("It is a Fibonacci Number");
				break;
			}
			else if(n1 > num){
				System.out.println("It is not a Fibonacci Number");
				break;
				
			}
			else{
				n1 = n2;
				n2 = ans;
			}
		}
		
		
		System.out.println(" ");
		
		}
	}
}