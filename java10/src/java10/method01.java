package java10;

import java.util.Scanner;

public class method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���,�^��,�ƾǪ����Z");
		int chinese = scn.nextInt();
		int english = scn.nextInt();
		int math = scn.nextInt();
		System.out.println("�`���O" + fun1(chinese, english, math));
		System.out.println("�����O" + fun2(chinese, english, math));

	}

	public static long fun1(int v1, int v2, int v3) {
		int sum = v1 + v2 + v3;
		return sum;

	}
	public static long fun2(int v1, int v2, int v3) {
		int avg = ((v1+v2+v3)/3);
		return avg;
}
}