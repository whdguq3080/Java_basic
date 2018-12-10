package day2;
import java.util.Scanner;
class Calc2{    
      public static void main(String[] args){      
      System.out.println("숫자 두개를 입력하십시오.");
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      String op = scan.next();
      int b = scan.nextInt();

      int add = 0;

      if(op.equals("+")){
           add = a+b;
      }else if(op.equals("-")){
           add = a-b; 
      }else if(op.equals("*")){
            add= a*b;
      }else if(op.equals("/")){
            add=a/b;
      }else if(op.equals("%")){
            add=a%b;
      }else{
            add=0;
      }
           System.out.println(a+op+b+"="+add);
}
}



