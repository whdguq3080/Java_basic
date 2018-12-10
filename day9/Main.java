package day9;
import java.util.Scanner;
import day9.*;
public class Main {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
			 System.out.println("[메뉴]\n"
			 		+ "1.계산기\n"
			 		+ "2.Bmi\n"
			 		+ "3.달력\n"
			 		+ "4.성별체크\n"
			 		+ "5.성적표\n"
			 		+ "6.구구단\n"
			 		+ "7.로또\n"
			 		+ "8.홀수합\n"
			 		+ "9.이름과 성적배열\n"
			 		);
			 String select = scanner.next();
			 switch(select) {
			 case"0": System.out.println("종료...."); return;
			 case"1": 
				 Calc calc = new Calc();
				 calc.Calc1();
				 break;
			 case"2": 
				 Bmi bmi = new Bmi();
				 bmi.Bmi1();
				 break;
			 case"3": 
				 MyCalendar calendar=new MyCalendar();
				 calendar.Calendar1();
				 break;
			 case"4": 
				 GenderCheker cheker = new GenderCheker();
				 cheker.cheker();
				 break;
			 case"5": 
				 Grade grade = new Grade();
				 grade.test();
				 break;
			 case"6": 
				 Gugudan gugudan = new Gugudan();
				 gugudan.test();
				 break;
			 case"7": 
				 LottoNumberGen gen=new LottoNumberGen();
				 gen.test();
				 break;
			 case"8": 
				 OddSum oddSum = new OddSum();
				 oddSum.test();
				 
				 break;
				 
			 default : break;
			 }
		 }
	}
}
