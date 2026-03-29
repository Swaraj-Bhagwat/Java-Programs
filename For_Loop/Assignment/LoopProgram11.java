class LoopProgram11{
	
	public static void main(String[] args){
		int dist = 1;
		for(char ch='A'; ch<='Z' ; ch+= ++dist){
			
			System.out.print(ch + " ");
		}
	}
}