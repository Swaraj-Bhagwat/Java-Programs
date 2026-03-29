

class Palindrome{
	
	public static void main(String[] args){
		
		String str = "madam";
		boolean assump = true;
		
		
		for(int i=0, j=str.length()-1; i<str.length()/2; i++,j--){
			
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if(ch1!=ch2){
				
				assump = false;
				break;
			}
			
		}
		
		if(assump)
			System.out.println(str + " Palindrome");
		else
			System.out.println(str + " not a Palindrome");
		
		
	}
}