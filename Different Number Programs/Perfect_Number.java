
import java.util.Scanner;

class Perfect_Number{
	public static void main(String[] args){
		
		for( ; ; ){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		int div = 1;
		int sum = 0;
		
		while(div <= num/2){
			if (num % div == 0){
				sum += div ;
			}
			
			div++;
		}
		
		if(sum == num){
			System.out.println("Number is Perfect Number");
			System.out.println(" ");
		}
		else{
			System.out.println("Number is not a Perfect Number");
			System.out.println(" ");
		}
		}
	}
}