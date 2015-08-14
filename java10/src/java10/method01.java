package java10;

import java.util.Scanner;

public class method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入國文,英文,數學的成績");
		int chinese = scn.nextInt();
		int english = scn.nextInt();
		int math = scn.nextInt();
		System.out.println("總分是" + fun1(chinese, english, math));
		System.out.println("平均是" + fun2(chinese, english, math));

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