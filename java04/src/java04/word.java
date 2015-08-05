package java04;
import java.util.Scanner;
public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
	System.out.print("請輸入英文字母轉換大小寫");
		String a = scn.next();
		char[] b  = a.toCharArray();
		if((b[0]-'a')>=0 &&(b[0]-'a')<26){
		b[0] =(char) (65+(b[0]-'a')); 
		System.out.print(b[0]);
		}else{b[0] =(char) (32+(b[0])); 
		System.out.print(b[0]);
	
	
	}
	
	
	
}
}
		

