package day9;
import java.util.Scanner;
public class Gugudan {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단을 입력하세요.");
		int a = scanner.nextInt();
		String res = "";
		for(int i=1;i<10;i++) {
			res += a+"*"+i +"="+ a*i+"\n";
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Gugudan gugudan=new Gugudan();
		gugudan.test();
	}
}
