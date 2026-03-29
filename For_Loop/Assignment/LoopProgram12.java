import java.util.Scanner;

class LoopProgram12{
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Start number : ");
		int i = sc.nextInt();
		System.out.print("End number: " );
		int e = sc.nextInt();
		
		System.out.println("Initialization Begins...");
		
		for( ; i<=e ; i++){
			
			System.out.print(i+ " ");
		}
		System.out.println(" ");
		System.out.println("Execution Over...");
	}
}