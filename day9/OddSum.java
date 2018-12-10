package day9;
import java.util.Scanner;
public class OddSum {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("홀수의 합");
		int num=scanner.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%2!=0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	}

