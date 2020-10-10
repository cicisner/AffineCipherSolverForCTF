public class AFineCipher 
{

	public static void main(String[] args) 
	{
		int [] cipher = new int [] {18,8,13,7,7,19,18,8,0,21,21,18,13,22,24,18,11,19,22,9};
		
		// Possible values of a: 5,7,11,15,17,19,21,23,25
		// Possible values of b: 0 -> 26
		// m is likely 26 
		
		int [] mod = new int [] {21,15,19,7,23,11,5,17,25};
		
		for(int i = 0; i < mod.length; i++)
		{
			for(int j = 0; j < cipher.length;j++)
			{
				int p = mod[i] * (cipher[j]- 0);
				p = p % 26;
				System.out.print(p + " ");
			}
			System.out.println();
		}
		
	}

}

