package day4;

import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
    System.out.println("연도를 입력하십시오.");    
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    
    String aa = ""; 
    
    if((a%4==0 && a%100!=0) || a%400==0){
        aa = "윤년";         
    }else{
        aa = "평년";
    }
    System.out.println(a+"년"+":"+aa);   
   
}
}
