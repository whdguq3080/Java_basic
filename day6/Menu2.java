package day6;
import java.util.Scanner;
public class Menu2 {
		
		
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴] \n" 
				     	+"0.종료\n"
					    +"1.계산기\n"
					    +"2.BMI\n"
					    +"3.윤년계산\n"
					    +"4.주민번호\n"
					    +"5.등수구하기\n");
			String Select = scanner.next();
			switch (Select) {
			case "0":
				System.out.println("종료");
				return;

			case "1":
				System.out.println("오칙연산");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int result = 0;
				
			switch(op) {
				case "+" : result=a+b; break;
				case "-" : result=a-b; break;
				case "*" : result=a*b; break;
				case "/" : result=a/b; break;
				case "%" : result=a%b; break;
				default  : result=0; break;
			}
			case "2":
				System.out.println("몸무게");
				double w = scanner.nextDouble();
				System.out.println("키");
				double t = scanner.nextDouble();
				
				double Bmi =0.0;
				String Bmi2= "";
				t = t/100;
				t = t*t;
				Bmi = w/t*t;
				
				if(Bmi>=40) {
					Bmi2="고도비만";
				}else if(Bmi>=35) {
					Bmi2="중등도 비만";
				//}else if() {
					
				}
				
				
				}
		}
		
}
}
