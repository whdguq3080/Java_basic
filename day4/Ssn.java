package day4;
import java.util.Scanner;
class Ssn{
    public static void main(String[] args){
    System.out.println("주민등록번호를 입력하십시오.");
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    
    //"1"."3";"2"."4"; "5"."6";
    String gender = "";
    char ch=a.charAt(7);

    if(ch=='1'||ch=='3'){
             gender= "남자"; 
    }else if(ch=='2'||ch=='4'){
             gender= "여자";
    }else if(ch=='5'||ch=='6'){
             gender= "외국인";
    }else{
             gender= "다시 입력하세요.";
    }
    System.out.println(gender);
}
}
