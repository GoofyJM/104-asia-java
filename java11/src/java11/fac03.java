package java11;
import java.util.Scanner;
public class fac03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn  = new Scanner(System.in);
		
		System.out.print("請輸入一串數字");
		String n =scn.next();
		System.out.println(fac(n));
	}
	public static int fac(String n1) {
		
		int sum = 0;
		char a[]=n1.toCharArray();	
		for(int i=0;i<a.length;i++){
			sum = sum +1;
	
		}
		return sum;
		
		
		
		
		
		}
	
	

	}


