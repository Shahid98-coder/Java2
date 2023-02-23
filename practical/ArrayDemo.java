package Array;

public class ArrayDemo {		//Demo class
	
	public static void main (String args[])		//main 
	    {
	        int arrayname[]=new int[4]; 	//declaration 
	        arrayname[0]=90;		//initialize array
	        arrayname[1]=80;
	        arrayname[2]=60;
	        arrayname[3]=30;
	        
	        //traversing of array
	        for (int i = 0; i < arrayname.length; i++)		//length of array
	        {
	         System.out.println (arrayname[i]);
	        }
	        
	        float num[]= {3.3f,2.5f,6.5f,7.2f};
	        System.out.println("Element of Array : ");
	        for (float j:num) {
	        	System.out.println(j + " , ");
	        }
	    }
	
}


