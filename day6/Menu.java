package day6;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴] \n"
					+"0.종료\n"
					+"1.계산기\n"
					+"2.BMI\n"
					+"3.윤년계산\n"
					+"4.주민번호\n"
					+"5.등수구하기\n");
			String select = scanner.next();
			switch(select) {
			case "0":	
				System.out.println("종료");
				return;
			case "1":	
				System.out.print("숫자.연산자,숫자 입력");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int add = 0;
				
				switch(op){
				case"+": add=a+b;	break;
				case"-": add=a-b;	break;
				case"*": add=a*b;	break;
				case"/": add=a/b;	break;
				case"%": add=a%b;	break;
				default: add=0; 	break;
				}
				System.out.println("="+add);
				break;
			 case "2":
				 System.out.println("몸무게=");
				 double w= scanner.nextDouble(); //w=몸무게
				 System.out.println("키=");
				 double t= scanner.nextDouble(); //t=키
				 
				 double Bmi =0.0;
				 String Bmi2 = "";
				 
				 t= t/100;
				 Bmi=w/t*t;
				 
				 if(Bmi>=40) {
					 	Bmi2 = "고도비만";
				 }else if(Bmi>=35) {
					 	Bmi2 = "중등도비만";
				 }else if(Bmi>=30) {
					 	Bmi2 = "경도비만";
				 }else if(Bmi>=25) {
					 	Bmi2 = "과체중";
				 }else if(Bmi>=18.5) {
					 	Bmi2 = "정상";
				 }else {
					 	Bmi = 0;
				 }
				 System.out.println("Bmi="+Bmi);
				 System.out.println(Bmi2);
				 break;
			 case "3":
				 System.out.println("연도를 입력하십시오.");
				 int ye = scanner.nextInt();
				 String ye2 = "";
				 
				 if(ye%4==0 && ye%100!=0 || ye%400==0) {
					 	 ye2 = "윤년";
				 }else{
					 	 ye2 = "평년";
				 }
				 System.out.println(ye + "년"+ "=" + ye2);
				 break;
			 case "4":	 
				 System.out.println("주민등록번호를 입력하십시오.");
				 
				 String ssn= scanner.next();
			     char ch=ssn.charAt(7);
				 String gen = "";
				 
				 if(ch=='1'|| ch=='3') {
					 	gen="남자";
				 }else if(ch=='2'||ch=='4') {
					 	gen="여자";
				 }else if(ch=='5'||ch=='6') {
					 	gen="외국인";
				 }else {
					 	gen="다시 입력하세요";
				 }
				  System.out.println(gen);
				
			    break;
			 case "5":
				String n1= scanner.next();
				int f = scanner.nextInt();
				String n2= scanner.next();
				int s = scanner.nextInt();
				String n3= scanner.next();
				int tt = scanner.nextInt();
				
				String ra = "";
				
				if(f<=100 && s<=100 && tt<=100) {
					if(f>s && s>tt) {
					 ra += "1등" + n1 + f + "점";//ra = ra +"1등" + n1 + f + "점";
					 ra += "2등" + n2 + s + "점";
 					 ra += "3등" + n3 + tt + "점";
					}else if(f>tt && tt>s) {
						 ra += "1등" + n1 + f + "점";
						 ra += "2등" + n3 + tt + "점";
						 ra += "3등" + n2 + s + "점";
					}else if(s>f && f>tt) {
						 ra += "1등" + n2 + s + "점";
						 ra += "2등" + n1 + f + "점";
						 ra += "3등" + n3 + tt + "점";
					}else if(s>tt && tt>f) {
						 ra += "1등" + n2 + s + "점";
						 ra += "2등" + n3 + tt + "점";
						 ra += "3등" + n1 + f + "점";
					}else if(tt>f && f>s){
						 ra += "1등" + n3 + tt + "점";
						 ra += "2등" + n1 + f + "점";       
						 ra += "3등" + n2 + s + "점"; 	   
					}else {
						 ra += "1등" + n3 + tt + "점";
						 ra += "2등" + n2 + s + "점";
						 ra += "3등" + n1 + f + "점";
					}
					 	
					}else {
						System.out.println("잘못");
						
					}
					 	System.out.println(ra);
						break;
						
				
			} 
		}
	}
}
				


