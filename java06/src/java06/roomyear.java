package java06;

import java.util.Scanner;

public class roomyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int m = 0;
		
		while (m == 0) {
			System.out.println("請輸入年分");
			int year = scn.nextInt();
			if (year % 100 == 0) {
				System.out.println("這不是閏年");
				
			} else if (year % 400 == 0 || year % 4 == 0) {
				System.out.println("這是閏年");
				m++;
				
			}else {
					System.out.println("這不是閏年");
			
		}
	}
}}
