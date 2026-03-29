
import java.util.Scanner;
class Reversestring{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		
		String str = sc.nextLine();
		String rev = "";
		
		
		for(int i = 0; i<str.length(); i++){
			
			
			char ch = str.charAt(i);
			rev = ch + rev ;
		}
		
		System.out.println("The reverse of a string is : " + rev);
		
		
	}
}