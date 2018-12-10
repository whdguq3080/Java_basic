package day4;
import java.util.Scanner;
import java.util.Random;
class WhileDemo{
    public static void main(String[] args){
    System.out.print("1부터 10까지 출력");
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int limit = random.nextInt(11)+1;
    System.out.println("랜덤수:"+limit);
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
        System.out.println("sum의 변화:"+"="+sum);
        count ++;
    }
    System.out.println(a+sum);
}
}
