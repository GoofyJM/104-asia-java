package java13;

import java.util.Random;
import java.util.Scanner;

public class fun02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int n = rnd.nextInt(999) + 1;
		int s[] = fac(n);
		System.out.println("�`�@" + n);
		System.out.println(s[0] + "�d"+s[1] + "��"+s[2] + "�B"+s[3] + "��");
		

	}

	public static int[] fac(int n) {
		
		int aa[] = new int[4];
		while (n > 0) {
			aa[0] = n / 1000;
			n = n % 1000;
			aa[1] = n / 100;
			n = n % 100;
			aa[2] = n / 10;
			n = n % 10;
			aa[3] = n / 1;
			n = n % 1;

		}
		return aa;

	}

}