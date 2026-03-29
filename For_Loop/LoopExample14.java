class LoopExample14{
	
	public static void main(String[] args){
		
		int esum = 0, osum = 0;
		System.out.print("Enter a number: ");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i = num; i>0 ; i = i/10){
			
			int ld = i%10 ;
			if(ld%2==0)  esum+= ld;
			else osum += ld;
		
		}
		
		System.out.println("Sum of even digits: "+ esum);
		System.out.println("Sum of odd digits: " + osum);

	}
}