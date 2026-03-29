class LoopProgram13{
	public static void main(String[] args){
		
		for(char ch = 'A' ; ch<='Z'; ch++){
			
			switch(ch){
				
				case 'A', 'E', 'I', 'O', 'U' : {
					System.out.println(ch+ " is a vowel");
				}
				default: {
					System.out.println(ch+ " is a consonent");
				}
			}
		}
		
		
	}
}