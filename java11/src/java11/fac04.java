package java11;

import java.util.Scanner;

public class fac04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入2個整數");
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.print("最大公約數是"+(fac(n ,  m)));
	}

	public static int fac(int n , int m) {
		while(n%m!=0){
			int aa=n%m;
			n=m;
			m=aa;
			}
			return m;
			}
				
				
				
				
				
			
}




