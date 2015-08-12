package java08;

import java.util.Scanner;
import java.util.Random;

public class boringgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[5];
		int data1[] = new int[5];
		int n = 5;
		
		
		boolean flag = false;
		System.out.println("請照大小輸入0~100中五個數字");
		for (int i = 0; i < n; i = i + 1) {
			data1[i] = scn.nextInt();
		}
		int num = 0;
		
		while (num < 5) {
			data[num] = rnd.nextInt(100);
			flag = false;
			for (int j = 0; j < num; j++) {
				if (data[num] == data[j]) {
					flag = true;

				}
			}
			if (flag == false) {
				num++;
			}
			
		}
		
		for (int i = 0; i < n; i = i + 1) {

			for (int j = i + 1; j < n; j = j + 1) {

				if (data[i] > data[j]) {
					int v1 = data[i];
					data[i] = data[j];
					data[j] = v1;
				}
			}
		}
		for (int i = 0; i < n; i = i + 1) {

			for (int j = i + 1; j < n; j = j + 1) {

				if (data1[i] > data1[j]) {
					int v2 = data1[i];
					data1[i] = data1[j];
					data1[j] = v2;
				}
			}
		}
		for (int i = 0; i < n; i = i + 1) {

			System.out.println(data[i]);
		}
		if (data[3] > data1[3]) {
			System.out.println("你輸了");
		} else {
			System.out.println("你贏了");
		}

	}

}
