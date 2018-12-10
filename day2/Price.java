package day2;
import java.util.Scanner;
class Price{		
  	 public static void main(String[]  args){
               System.out.println("얼마에요?");
               Scanner scan=new Scanner(System.in);
               String num1= scan.next();
               int a = Integer.parseInt(num1);
               System.out.println(a +" 입니다.");	
 

              System.out.println("몇개 드릴까요?");
              Scanner scan1=new Scanner(System.in);
	 String num2= scan1.next();
	 int b = Integer.parseInt(num2);
	 System.out.println(b +" 개요.");
   	

	int add=0;
              if(a>=1000){
	  add=a*b;
	  add=add/100;
	  add=add*80;  
              }else if(a>=500){
               add=a*b;
	  add=add/100; 
	  add=add*90;
	}else{
	  add = a* b;
	} 
                System.out.println("총 금액은" + add + "입니다.");
                 
      }
}	

