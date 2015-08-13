package java09;

import java.util.Scanner;

public class array0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		System.out.println("請輸入有幾個同學");
		int n = scn.nextInt();
		float data[][] = new float[n][4];
		String name[] = new String[n];
		for (i = 0; i < n; i++) {
			System.out.println("請輸入第" + (i + 1) + "個同學的名字");
			name[i] = scn.next();
			System.out.println("請輸入3科成績");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = (data[i][0] + data[i][1] + data[i][2]) / 3;
		}
		System.out.println("全班平均如下:");
		for (i = 0; i < n; i++) {
			System.out.println(name[i] + "\t" + data[i][3]);
		}

		System.out.println("不及格人數為:");
		for (i = 0; i < n; i++) {
			if (data[i][3] < 60) {
				sum++;
			}
		}
		System.out.println(sum + "人");
		
		
		for (i = 0; i < n; i = i + 1) {
			
			for (int j = i + 1; j < n; j = j + 1) {

				if (data[i][3] > data[j][3]) {
					int v1 = (int) data[i][3];
					data[i][3] = data[j][3];
					data[j][3] = v1;
				}
			}
		}
		System.out.println("最低分是"+data[0][3]);
		System.out.println("最高分是"+data[n-1][3]);
	}

}
