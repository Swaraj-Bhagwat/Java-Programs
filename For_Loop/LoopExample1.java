

class LoopExample1{
	public static void main(String[] args){
		
		
		System.out.println("Execution Starts");
		int i = 1;
		
		for(System.out.println("Initialization"); i<=4 ; System.out.println(i + " Updation"))
		{
			System.out.println(i + " condition true");
			System.out.println(i + " loop has performed task \n");
			i++;
			
		}
		System.out.println("Execution Ends");
	}
}