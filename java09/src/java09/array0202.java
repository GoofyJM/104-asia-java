package java09;

import java.util.Scanner;

public class array0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		System.out.println("�п�J���X�ӦP��");
		int n = scn.nextInt();
		float data[][] = new float[n][4];
		String name[] = new String[n];
		for (i = 0; i < n; i++) {
			System.out.println("�п�J��" + (i + 1) + "�ӦP�Ǫ��W�r");
			name[i] = scn.next();
			System.out.println("�п�J3�즨�Z");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = (data[i][0] + data[i][1] + data[i][2]) / 3;
		}
		for (i = 0; i < n; i = i + 1) {

			for (int j = i + 1; j < n; j = j + 1) {

				if (data[i][3] < data[j][3]) {
					int v1 = (int) data[i][3];
					data[i][3] = data[j][3];
					data[j][3] = v1;
				}
			}
		}
		System.out.println("���Z���ư��C�ƧǦp�U:");
		for (i = 0; i < n; i++) {
			
			
			System.out.println(name[i] + "\t" + data[i][3]);
		
		
		
		
		}
		
		System.out.println("�̧C���O" + data[0][3]);
		System.out.println("�̰����O" + data[n - 1][3]);

		System.out.println("���ή�H�Ƭ�:");
		for (i = 0; i < n; i++) {
			if (data[i][3] < 60) {
				sum++;
			}
		}
		System.out.println(sum + "�H");

		System.out.println("");

	}

}