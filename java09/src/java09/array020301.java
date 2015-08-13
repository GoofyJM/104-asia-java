package java09;

import java.util.Scanner;

public class array020301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入矩陣 m x p");

		int m = scn.nextInt();
		int p = scn.nextInt();
		int dataa[][] = new int[m][p];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= p; j++) {
				System.out.println("請輸入第" + i + "行" + j + "列的數");

				dataa[i - 1][j - 1] = scn.nextInt();

			}

		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= p; j++) {
				System.out.print(dataa[i - 1][j - 1] + "\t");
			}
			System.out.println("");
		}

		System.out.println("請輸入矩陣p x n");
		
		System.out.println("p為"+p);
		int n = scn.nextInt();
		int datab[][] = new int[p][n];
		
		for (int i = 1; i <= p; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("請輸入第" + i + "行" + j + "列的數");

				datab[i - 1][j - 1] = scn.nextInt();

			}

		}
		for (int i = 1; i <= p; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(datab[i - 1][j - 1] + "\t");
			}
			System.out.println("");
		}
		System.out.println();
	
		int datac[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for(int kk=0;kk<n;kk++){
					int jk=dataa[i][j] * datab[j][i];
					datac[i][j]=datac[i][j]+jk;
				}
				
				//datac[i][j] = (dataa[i][j] * datab[j][i]+dataa[j][i] * datab[i][j]);
				System.out.print(datac[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
