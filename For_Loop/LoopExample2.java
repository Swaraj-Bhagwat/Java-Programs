class LoopExample2{	
     public static void main(String[] args){
		 
		 
		 //(A-Z)
		 for (char ch = 'A'; ch<='Z' ; ch++)
		 {
			 System.out.println(ch + "-" + (ch+0)+ " ");
		 }
		 
		 System.out.println("  ");
		 //1 - 100(odd numbers)
		 for (int i = 1; i<= 100 ; i++)
		 {
			 if(i%2!=0){
				 System.out.print(i + " ");
			 }
			 
		 }
	 }
}
   