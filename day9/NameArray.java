package day9;

public class NameArray{
	public void test(){
		
		String[] a = {"홍길동","유관순","이성계"};
		String res = "";
		for(int i=0; i<3; i++) {
			if(i<2) {
			res += a[i]+",";
			}else{
			res += a[i]+"";	
			}
		}
		System.out.println(res);
		
	}public static void main(String[] args) {
		NameArray n1 = new NameArray();
			n1.test();
	}
	}
	

