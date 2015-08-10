package java06;

import java.util.Scanner;

public class star02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入星星數");
		int num = scn.nextInt();
		char star = '*';
		for (int i = 1; i <= num; i = i + 1) {

			for (int k = 1; k < num - i+1 ; k = k + 1) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j = j + 1) {
				System.out.print(star);
			}
			System.out.println("");
			
		}
	}
}
