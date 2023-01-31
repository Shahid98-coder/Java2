import java.util.Scanner;

public class SwitchExample2{
	public void calc(int level){
		switch(level){
			case"1" :
			System.out.println("Your level is Beginner level=1");			
			break;    
			case"2" :
			System.out.println("Your level is Intermediate level=2");
			case"3" :
			System.out.println("Your level is Expert level=3");
			break;    
			default: 
			System.out.println("Invalid error ");
	
		}  
	}    

	public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int level= sc.next();
		SwitchExample2 se=SwitchExample2();
		se.calc(level);

}  
} 
