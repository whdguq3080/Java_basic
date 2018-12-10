package day7;
import java.util.Scanner;
public class Calc {
	
		public void Cal(){
			Scanner scanner = new Scanner(System.in);
			System.out.println("계산기");
			
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			int add = 0;
			
			switch(op) {
			case "+" : add= a+b; break;
			case "-" : add= a-b; break;
			case "*" : add= a*b; break;
			case "/" : add= a/b; break;
			case "%" : add= a%b; break;
				
			}System.out.println(a+b+"="+add);
			
			
			
		}
	
}
