package java04;

import java.util.Scanner;

public class SCILL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�п�J�^��r���ഫ�j�p�g");
		String a = scn.next();
		char[] b  = a.toCharArray();
		if((b[0]-'a')>=0 &&(b[0]-'a')<26){
		b[0] =(char) (65+(b[0]-'a')); 
		System.out.print("�o�O�p�g");
		}else{b[0] =(char) (32+(b[0])); 
		System.out.print("�o�O�j�g");
		}		
}
}