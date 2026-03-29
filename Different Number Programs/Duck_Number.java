
import java.util.Scanner;

class Duck_Number{
	public static void main(String[] args){
		
		for( ; ; ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		int temp = num;
		int digit = 0;
		int sum;
		
		while(temp > 0){
			
			sum = temp%10;
			if(sum == 0){
				digit = 1;
				break;
			}
			
			temp = temp/10;
			
		}
		
		if(digit == 1){
			System.out.println("Duck number found");
			System.out.println(" ");
		}
		else{
			System.out.println("Duck number not Found");
			System.out.println(" ");
		}
		
		}
	}
}