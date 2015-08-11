
package java07;

import java.util.Scanner;
import java.util.Random;

public class array02 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[10];
		int n = 10;
		int i = 0;
		boolean flag = false;

		while(i<10){
			data[i] = (rnd.nextInt(99)+1);
			flag = false;
			for(int j =0;j<i;j++){
				if(data[i]==data[j]){
				flag = true;	
					
				}
			}
			if(flag==false){
				i++;
			}
		}
		for (i = 0; i < n; i = i + 1) {
		System.out.println(data[i]);
		}
}}
