package day5;
import java.util.Scanner;
class Menu2{
    public static void main(String[] args){
        System.out.println("[메뉴] 0.정지 1.시작");
        Scanner scan = new Scanner(System.in);
        int flag = scan.nextInt();
        
        int count = 1;
        String a= ""; //
        int sum = 0;
        boolean b= true;
        
        while(b){
            if(count == 1){
                b = true;
                System.out.println("시스템 작동중");
            }else{
                b = false;
                System.out.println("시스템 정지됨");
            }
            
         }
         System.out.println("시스템 종료");
        
     }
}