  import java.util.Scanner;
  
  class PoundsConversion{
	  public static void main(String[] args){
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter the Pounds to convert into Kilograms:  ");
		  
		  double pounds = sc.nextDouble();
		  
		  double conversion = pounds * 0.454 ;
		  
		  System.out.print("The Converison is : "+ String.format("%.3f", conversion)+ " Kilograms");
		  
		  
		  
		  
	  }
      
  }