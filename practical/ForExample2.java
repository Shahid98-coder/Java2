import java.util.Scanner;
class ForExample2{
	public void calcTable(int number){
	for(int i=1; i<=10; i++ ){
		System.out.println(number + "X" + i + "="  + (number * i));
	}
	}
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a number for table");
	int number = sc.nextInt();
	ForExample2 fe = new ForExample2();
	fe.calcTable(number);
	
}
}
