package java07;

import java.util.Scanner;
import java.util.Random;

public class array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[10];
		int n = 10;
		int c = 0;
		for (int i = 0; i < n; i = i + 1) {
		
			data[i] = (rnd.nextInt(99) + 1);
	
			if (data[i] % 2 == 0) {
				c++;
			}
		}
		int j = 1;
		while (j < 4) {
			System.out.println("�вq�q�ݦ��X�Ӱ���");
			int b = scn.nextInt();

			if (c == b) {
				System.out.println("�AĹ�F���׬O" + c + "��");

				break;

			} else {
				System.out.println("�A��F");

				j++;
			}
		
		}
		for (int i = 0; i < n; i = i + 1) {
			
			System.out.println(data[i]); 
	}
}}
