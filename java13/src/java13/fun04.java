package java13;

import java.util.Scanner;

public class fun04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@��Ʀr");
		String n = scn.next();
		System.out.println(fac(n));
	}

	public static int fac(String n) {

		
		char a[] = n.toCharArray();
		int i =a.length;
		if(i<a.length){
			return 1;
			}else{
				i+=1;
		}
		return i-1;
	}

}
