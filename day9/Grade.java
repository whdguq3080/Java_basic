package day9;
import java.util.Scanner;
public class Grade {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇명의 학생의 이름과 점수를 입력하시겠습니까?");
		int num = scanner.nextInt();
		System.out.println(num+"명의 이름과 점수를 입력하세요.");
		String[] name= new String[num];
		int[] add=new int[num];
		for(int i=0;i<num;i++) {
			name[i] = scanner.next();
			add[i] = scanner.nextInt();
		}
		String res = "";
		for(int i=0;i<num;i++) {
			if(i<num-1) {
				res+=name[i]+add[i]+",";
			}else{
				res+=name[i]+add[i];
			}
		}
		System.out.println(res);
	}
}
