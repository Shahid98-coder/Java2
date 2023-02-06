class parent{
	String name = "Jack john ds";
	String pborn="1-1-1963";
	double height = 8.0;
	String color = "fair";
	
}

class first_child extends parent{
	String name = "Henry jack ds";
	String fborn="6-6-1978";
	double height = 7.0;
	String color = "wheatcolor";
	
	public void Display(){
		System.out.println("First parent conditions");
		System.out.println("Name:"+super.name);
		System.out.println("Born: "+pborn);
		System.out.println("height: "+super.height);
		System.out.println("color: "+super.color);
		System.out.println(" ");
		System.out.println("First child conditions");
		System.out.println("Name:"+name);
		System.out.println("Born: "+fborn);
		System.out.println("height: "+height);
		System.out.println("color: "+color);
		System.out.println(" ");
	}
}

class second_child extends first_child{
	String name = "Donald henry ds";
	String sborn = "14-2-2002";
	double height = 6.0;
	String color = "black";
	
	public void display(){
		System.out.println(" ");
		System.out.println("First parent conditions");
		System.out.println("Name:"+super.name);
		System.out.println("Born: "+fborn);
		System.out.println("height: "+super.height);
		System.out.println("color: "+super.color);
		System.out.println(" ");
		System.out.println("Second child conditions");
		System.out.println("Name:"+name);
		System.out.println("Born: "+sborn);
		System.out.println("height: "+height);
		System.out.println("color: "+color);
	}
	
	
}

class multilevelinheritance{
	public static void main(String args[]){
		first_child ml = new first_child();
		second_child mln = new second_child();
		ml.Display();
		mln.display();
	}
}