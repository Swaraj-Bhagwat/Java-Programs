import java.util.Scanner ;

class Calculate_tips{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Subtotal : ");
		float subtotal = sc.nextFloat();
		
		System.out.print("Enter the Gratuity Rate (%):  ");
		float rate = sc.nextFloat();
		
		float tip = subtotal * (rate/100);
		
		float total = subtotal +  tip ;
		
		System.out.println("The tip is : " + String.format("%.2f",tip) + " Rs and the total is : " +  String.format("%.2f",total) + " Rs");
		
	}
}