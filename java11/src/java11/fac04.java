package java11;

import java.util.Scanner;

public class fac04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�п�J2�Ӿ��");
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.print("�̤j�����ƬO"+(fac(n ,  m)));
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




