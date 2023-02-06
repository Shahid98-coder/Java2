class owner{
	String name="shahid";
	int area= 1000;
	boolean noc= true;
	public  void renew(){
		String color ="blue";
		int ceilheight = 8;
		String flat ="2bhk";
		
		System.out.println("Old Flat Vlaue : " + "color--"+ color + ", " + "type--" + flat+", " + "height--" + ceilheight);
	}
}

class New_owner extends owner{
	double value = 2000000;
	String name= "eram";
	
	public void display(){
		System.out.println("Area is : "+ area);
		System.out.println("owner Name is : "+super.name);
		System.out.println("Current price is : "+ value);
		System.out.println("New owner Name is : "+ name);
	}
	public  void renew(){
		String color ="offwhite";
		int ceilheight = 10;
		String flat ="3bhk";
		System.out.println("New Flat Value: " + "color--"+ color + ", " +"type--" + flat + ", " + "height--" + ceilheight);
		
		super.renew();
	}
}
class InheritanceExample{
	public static void main(String args[]){
		New_owner c = new New_owner();
		c.display();
		c.renew();

	}

}