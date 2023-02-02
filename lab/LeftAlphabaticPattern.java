public class LeftAlphabaticPattern
{
	public static void main(String[] args)
	{
		int alphabet = 65; //ASCII value of capital A is 65  
		for (int i = 5; i >= 0; i--)  //inner loop for rows
		{
			for (int j = 0; j <= i; j++)  //outer loop for column
			{  
//adds the value of j in the ASCII value of A and prints the corresponding alphabet  
			System.out.print((char) (alphabet + j) + " ");   
			}  
			System.out.println();  
		}  
	}  
}  