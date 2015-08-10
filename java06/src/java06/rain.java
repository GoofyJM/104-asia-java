package java06;

import java.util.Scanner;

public class rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		
		double n = 20000d;
		int k = 1;
		while (n < 1100000) {

			n +=  n * 0.15;
			k++;
			System.out.println(k + "小時候水庫量為" + n);

		}
		System.out.println(k);

	}
