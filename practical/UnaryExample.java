class UnaryExample{
	public void calcIncrement(){
		int x = 10;
		System.out.println("Increment Value :");
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
	}
	public void calcDecrement(){
		int x=10;
		System.out.println("------------");
		System.out.println("Decrement Value :");
		System.out.println(x--);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);

	}
	public static void main(String args[]){
		UnaryExample id = new UnaryExample();
		id.calcIncrement();
		id.calcDecrement();
	}
}