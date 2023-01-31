import java.util.Scanner;

class SwitchExample{
	public void calc_grade(String grade){
		switch(grade){
		case"A" :
		System.out.println("Congrats.... Your mark is in range of 100 - 80");
		break;
		case"B" :
		System.out.println("Great.... Your mark is in range of 80 - 70");
		break;
		case"C" :
		System.out.println("Great.... Your mark is in range of 70 - 60");
		break;
		case"D" :
		System.out.println(" Your mark is in range of 60 - 50");
		break;
		case"E" :
		System.out.println(" Your mark is in range of 50 - 35");
		break;
		case"F" :
		System.out.println("Failed.... Your mark is in range of 35 - 0");
		break;
		default:
		System.out.println("Invalid Grade ");
	}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade ");
		String grade = sc.next();
		grade = grade.toUpperCase();
		SwitchExample se = new SwitchExample();
		se.calc_grade(grade);
	
}
}