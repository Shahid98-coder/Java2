public class EvenOdd
{
   public static void main(String[] args)
   {
      System.out.println("Even numbers between 1 and 200: ");
      for(int a = 1; a <= 200; a++)  		 //this will print 1-200 number.  
      {
         if(a % 2 == 0)						//if a%2 is equal to zero, the number is even.
         {
            System.out.print(a + " ");
         }
      }
      System.out.println("\nOdd numbers between 1 and 200: ");
      for(int a = 1; a <= 200; a++)			//this will print 1-200 number. 
		{
         if(a % 2 != 0)						//if a%2 is not equal to zero, the number is odd.
         {
            System.out.print(a + " ");
			 
         }
		}
		int i, num=200, sum=0;  
			//executes until the condition returns true  
			for(i = 1; i <= num; ++i)
			{  
			//adding the value of i into sum variable  
			sum = sum + i;  
			}  
			//prints the sum   
			System.out.println("\n\n Sum of 200 Natural Numbers is = " + sum); 
   }
}