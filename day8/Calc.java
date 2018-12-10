package day8;

import java.util.Scanner;

public class Calc {
		public void Calc1() {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			int result = 0;
			
			switch(op) {
			case "+" : result = a+b; break;
			case "-" : result = a-b; break;
			case "*" : result = a*b; break;
			case "/" : result = a/b; break;
			case "%" : result = a%b; break;
			default : result = 0; 	 break;
			}
			System.out.println(a+op+b+"="+result);
			}
	
}
