public class LogicalExample{
	public void calc(){
		int a = 11;
		int b = 7;
		
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)||(a<b));
		System.out.println((a<b)&&(a++<b));
	}
	public static void main(String arg[]){
		LogicalExample obj = new LogicalExample();
		obj.calc();
	}
}