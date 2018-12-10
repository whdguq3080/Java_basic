package day8;

import java.util.Scanner;

public class GenderCheker {
	
		public void cheker() {
			System.out.println("주민등록번호를 입력하세요.");
			Scanner scanner = new Scanner(System.in);
			String ssn1=scanner.next();
			char gen=ssn1.charAt(7);
			String ssn="";
			if(gen=='1' || gen=='3') {
					ssn = "남자";
			}else if(gen=='2' || gen=='4') {
					ssn = "여자";
			}else if(gen=='5' ||  gen=='6') {
					ssn = "외국인";
			}else {
					ssn = "다시 입력하세요";
			}
				System.out.println(ssn);
			
		}

}
