package java05;

import java.util.Scanner;

public class sum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("請輸入班級人數");
		int people = scn.nextInt();
		int tall = 0;
		int weight = 0;
		int i;
		float averagetall;
		float averageweight;
		for (i = 1; i <= people; i = i + 1) {
			System.out.println("請輸入第" + i + "人身高");
			int tall2 = scn.nextInt();
			System.out.println("請輸入第" + i + "人體重");
			int weight2 = scn.nextInt();
			tall = tall + tall2;
			weight = weight + weight2;
		}
		averagetall = tall/people;
		averageweight = weight/people;
		System.out.println("平均身高為"+averagetall);
		System.out.print("平均體重為"+averageweight);
		
		
		
		
		
		
		

	}

}
