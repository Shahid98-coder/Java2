class VariableExample{
	static int num =55;
	long num1 = 5412380;
	
	public void display(){
		char a = 'M';
		double num2 =45.5454;
		System.out.println("local variable value : "+a);
		System.out.println("local variable value: "+num2);
	}
	public static void calc(){
		double b = 99.33;
		double c = 45.23;
		double res = b * c;
		System.out.println("Result is :" +res);
	}

public static void main(String args[]){
	VariableExample obj = new VariableExample();
	obj.display();
	calc();
	System.out.println("Instance variable value: "+obj.num1);
	System.out.println("Static variable value: "+num);
}
	