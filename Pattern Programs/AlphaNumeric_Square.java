
class AlphaNumeric_Square
{
	public static void main(String[] args)
	{
		int num = 1;
		char ch = 'a';
		int n = 4;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i%2!=0)
				{
					System.out.print(num + " ");
					num+=1;
				}
				else
				{
					System.out.print(ch++ + " ");
					
				}
			}
			
			System.out.println();
		
			
		}
	}
}