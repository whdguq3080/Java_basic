package day6;
import java.util.Scanner;
public class ForloopDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String res = "";
		int res2 = 0;
		
		
		for(int i=1; i<=10; i++) {
			res2 += i;
			if(i!=10) {
				res +=i+"+";
			}else {
				res +=i+"="; 
				break;
			}
			}System.out.print(res+res2);
}
}
