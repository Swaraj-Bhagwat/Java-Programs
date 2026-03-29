import java.util.Scanner ;

class FeetConversion{
	
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Feet to convert into meter:  ");
		double feet = sc.nextDouble();
		
		double conversion = feet * 0.305;
		
		System.out.println("The conversion is : " + String.format("%.3f",conversion) + " meters");
		
		
	}
}