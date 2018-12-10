package day5;
import java.util.Scanner;

class Menu{
    public static void main(String[] args){
        System.out.println("1부터 10까지");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        int count = 1;
        String a= ""; //flac
        boolean flag = true;
        int sum = 0;

        while(flag){
            if(count != limit){
                a += count +"+";
            }else{
                a += count +"=";
                flag=false;
            }
            sum += count;
            count++;
         }
        System.out.println(a+sum);


    }
}


