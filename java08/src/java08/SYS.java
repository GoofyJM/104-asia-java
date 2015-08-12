package java08;

import java.util.Random;
import java.util.Scanner;

public class SYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[20];
		int v1=0;
		int v2=0;
		int v3=0;
		int n = 20;

		for (int i = 0; i < n; i = i + 1) {

			data[i] = (rnd.nextInt(20) - 10);
			if(data[i]>0){
			v1++;
			}else if(data[i]<0){
			v2++;
			}else{
			v3++;
			}

		}
		for (int i = 0; i < n; i = i + 1) {
			System.out.println(data[i]);
			
		
		}
		System.out.println("正數有"+v1+"個");
		System.out.println("0有"+v3+"個");
		System.out.println("負數有"+v2+"個");
	

}
}