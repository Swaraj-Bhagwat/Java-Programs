class PrimeNumber{
	public static void main(String[] args){
		
		int num = 11;
		int den = 2;
		
		while(den<num){
			
			if(num % den == 0){
				break;
			}
			den++;
		}
		
		if(num == den){
			System.out.println("It is a Prime");
		}
		else{
			System.out.println("It is not a Prime");
		}
	}
}