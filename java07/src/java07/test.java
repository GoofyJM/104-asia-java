package java07;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(data[i]);

	}
}


