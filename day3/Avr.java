package day3;

import java.util.Scanner;
class Avr{
public static void main(String[]   args){
		System.out.println("이름이 무엇입니까?");
		Scanner scan= new Scanner(System.in);
		String num1=scan.next(); 

		System.out.println("국어,영어,수학,과학,사회 과목 점수를 입력해주세요.");
		String sub1 = scan.next();
		String sub2 = scan.next();
		String sub3 = scan.next();
		String sub4 = scan.next();
		String sub5 = scan.next();

		int a = Integer.parseInt(sub1);
		int b = Integer.parseInt(sub2);
		int c = Integer.parseInt(sub3);
		int d = Integer.parseInt(sub4);
		int e = Integer.parseInt(sub5);

		int avr = a+b+c+d+e;
		int avr1 = avr/5 ;

		if(avr1>=90){
			System.out.println(num1 + "총점" + avr +"평균"+ avr1 + "성적 A학점.");	
		} else if(avr1>=80){
			System.out.println(num1 + "총점" + avr +"평균"+ avr1 + "성적 B학점.");	
		}  else if(avr1>=70){
			System.out.println(num1 + "총점" + avr +"평균"+ avr1 + "성적 C학점.");	
		} else if(avr1>=60){
			System.out.println(num1 + "총점" + avr +"평균"+ avr1 + "성적 D학점.");	
		} else {
			System.out.println(num1 + "총점" + avr +"평균"+ avr1 + "성적 F학점.");	
		}
  	}
	}