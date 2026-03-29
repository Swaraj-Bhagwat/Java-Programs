
import java.util.Scanner;

class Alternate_PrimeNumber{
	public static void main(String[] args){
		
		for( ;  ; ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int den = 2;
		
		while(den<num/2){
			
			if(num%den == 0){
				break;
			}
			den++ ;
		}
		
		if(den == num/2){
			System.out.println("It is a Prime Number");
			System.out.println(" ");
		}
		else{
			System.out.println("It is not a Prime Number");
			System.out.println(" ");
		}
		}
	}
}