
import java.util.Scanner;

class Spy_Number{
	public static void main(String[] args){
		
		for( ; ; ){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num;
		int SOD = 0;
		int POD = 1;
		int digit ;
		
		while(temp > 0){
			digit = temp%10;
			SOD = SOD + digit;
			POD = POD * digit;
			temp = temp/10;
			
		
		}
		
			if(SOD == POD){
				System.out.println("The number is SPY");
				System.out.println(" ");
			}
			else{
				System.out.println("The number is not SPY");
				System.out.println(" ");
			}
		
		
		}
	}
}