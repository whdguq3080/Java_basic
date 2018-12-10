package day4;
import java.util.Scanner;
class Test{       
    public static void main(String[] args){           
        Scanner scan = new Scanner(System.in);           
        String n1 = scan.next();           
        int a = scan.nextInt();           
        String n2 = scan.next();           
        int b = scan.nextInt();           
        String n3 = scan.next();           
        int c = scan.nextInt();           
        
        String add = "";           
        //(n1 홍길동49 a) (n2김유신78 b) (n3김구96 c)           
        if(a<=100 && b<=100 && c<=100){                
                if(a>b && b>c){                
                System.out.println("1등" + n1 + a + "점");                
                System.out.println("2등" + n2 + b + "점");                
                System.out.println("3등" + n3 + c + "점");                
                }else if(b>a && a>c){                
                System.out.println("1등" + n2 + b + "점");                
                System.out.println("2등" + n1 + a + "점");                
                System.out.println("3등" + n3 + c + "점");                
                }else if(c>b && a>b){                
                System.out.println("1등" + n3 + c + "점");                
                System.out.println("2등" + n1 + a + "점");                
                System.out.println("3등" + n2 + b + "점");                
                }else{                
                System.out.println("잘못 입력하셨습니다.");           
             }        
            }
        }
        }
