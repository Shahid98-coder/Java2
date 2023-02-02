public class PrintNumber {
    	public static void main(String args[]) {
		
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<100; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\n if the number <40 : ");			
		for (int i=41; i<100; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");
  }
}
