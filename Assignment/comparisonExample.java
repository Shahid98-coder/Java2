public class comparisonExample{
	public void calc(){
		int a = 10;
		int b = 5;
		
		System.out.println("a>b :"+(a>b));
		System.out.println("a>b :"+(a<b));
		System.out.println("a>b :"+(a>=b));
		System.out.println("a>b :"+(a<=b));
		System.out.println("a>b :"+(a==b));
		System.out.println("a>b :"+(a!=b));
	}
	public static void main(String arg[]){
		comparisonExample c = new comparisonExample();
		c.calc();
	}
}
