import java.util.Scanner;

public class SwitchStringExample{
	public void calc(int level){
		switch(levelString){
			case "Beginner": level=1;
			break;    
			case "Intermediate": level=2;  
			break;    
			case "Expert": level=3;  
			break;    
			default: level=0;  
			break;  
		}    
	}
	public void main(String args[]){
//Scanner sc = new Scanner(System.in);
	//int level = sc.next();
    System.out.println("Your Level is: "+level);  
	}    
}   
