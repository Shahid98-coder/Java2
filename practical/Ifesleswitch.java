class Ifesleswitch{
	public static void main(String args[]){
		int age = 76;
	
		if(age>=40 && age<=65){
			String shift = "First";

			switch(shift){
				
				case "First":
				System.out.println("fisrt shift allowed 6am - 3pm");
				break;
				
				case"Second":
				System.out.println("Second shift allowed 3pm - 11pm");
				break;
			}
			
		}
		else if(age >=20 && age<40){
			String shift1 = "Night";
			switch(shift1){
				
				case"Night":
				System.out.println("Night shift allowed 11pm - 6am");
				break;
				
				case"Genral":
				System.out.println("Genral shift allowed 3pm - 11pm");
				break;
		}
	}
	else{
		System.out.println(" age is not proper");
	}
	}

}