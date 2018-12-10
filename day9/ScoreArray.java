package day9;
import java.util.Scanner;
public class ScoreArray {
	 public void sa() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("숫자 3개를 입력하시오.");
		 int[] a = new int[3];
		 for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		 String arr="";
		 for(int i=0; i<a.length; i++){
			 if(i<a.length-1) {
				 arr +=a[i]+",";
			 }else {
				 arr +=a[i]+"";
			 }
		 }
		System.out.println(arr);
		 }
		  public static void main(String[] args) {
			 ScoreArray aa = new ScoreArray();
			 aa.sa();
	 }
		
	
}
