import java.util.Scanner;

class DoWhileExample { 
public void calc(int number){
	int i=1;
	do{
		System.out.println(i);
		i++;    
    }while(i<=10);
}

public static void main(String[] args) {    
       Scanner sc= new Scanner(System.in);
	   System.out.println("Enter a number ");
	   int number = sc.nextInt();
	   DoWhileExample we = new DoWhileExample();
	   we.calc(number);
}   
}    