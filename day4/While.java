package day4;
import java.util.Scanner;
class While{
    public static void main(String[] args){
    System.out.println("1부터 10까지 출력");
    Scanner scan = new Scanner(System.in);
    int limit = scan.nextInt();
    
    int count = 1;
    String a = "";
    int sum=0;
    while(count <= limit){        
    
        if(count != limit){
                a += count+"+";
                sum +=count;
        }else{
                a += count+"=";
                sum +=count;    
        }
        count++;
    }
    System.out.println(a+sum);
}
}
