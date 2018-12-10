package day9;

import java.util.Scanner;
public class Bmi {
			public void Bmi1() {
			Scanner scanner = new Scanner(System.in);
		 	System.out.println("몸무게");
		 	double w = scanner.nextDouble();
		 	System.out.println("키");
		 	double t = scanner.nextDouble();

		 	double Bmi = 0.0;
		 	String Bmi2= "";
		 	t= t/100;
		 	t= t*t;
		 	Bmi= w/t;
		 	
		 	if(Bmi>=40) {
		 		Bmi2= "고도비만";
		 	}else if(Bmi>=35) {
		 		Bmi2= "중등도비만";
		 	}else if(Bmi>=30) {
		 		Bmi2= "경도비만";
		 	}else if(Bmi>=25) {
		 		Bmi2="과체중";
		 	}else if(Bmi>=18.5) {
		 		Bmi2="정상";
		 	}else{
		 		Bmi=0;
		 	}
		 		System.out.println("Bmi"+"="+Bmi);
		 		System.out.println(Bmi2);
		 	
		 	
}
}