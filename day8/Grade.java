package day8;

import java.util.Scanner;

public class Grade {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하십시오");
		int y = scanner.nextInt();
		
		String year1 = "";
		
		if(y%100==0 && y%4!=0 || y%100==0) {
			 	year1 = "윤년";
		}else {
			 	year1 = "평년";
		}
			System.out.println(y+"년:"+year1);
		
	}

}
