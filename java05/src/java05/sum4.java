package java05;

import java.util.Scanner;

public class sum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("�п�J�Z�ŤH��");
		int people = scn.nextInt();
		int tall = 0;
		int weight = 0;
		int i;
		float averagetall;
		float averageweight;
		for (i = 1; i <= people; i = i + 1) {
			System.out.println("�п�J��" + i + "�H����");
			int tall2 = scn.nextInt();
			System.out.println("�п�J��" + i + "�H�魫");
			int weight2 = scn.nextInt();
			tall = tall + tall2;
			weight = weight + weight2;
		}
		averagetall = tall/people;
		averageweight = weight/people;
		System.out.println("����������"+averagetall);
		System.out.print("�����魫��"+averageweight);
		
		
		
		
		
		
		

	}

}
