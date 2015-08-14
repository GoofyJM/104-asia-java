package java10;

import java.util.Scanner;

public class method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字");
		String n = scn.next();
		System.out.println(fun1(n));
	}

	public static long fun1(String n){
			int sum = 0;
			char a[]=n.toCharArray();
			int data[] = new int[a.length];
			for(int i=0;i<a.length;i++){
				data[i]=a[i]-'0';
			sum = sum +data[i];
			}
		return sum;
		}
		
			
		
	}
	
		
		
		
		
		
		
	


