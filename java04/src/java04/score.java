
package java04;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�W�Ǵ����Z");
		System.out.print("���Z�@");
		float score1 = scn.nextFloat();
		System.out.print("���Z�G");
		float score2 = scn.nextFloat();
		System.out.print("���Z�T");
		float score3 = scn.nextFloat();
		System.out.print("���Z�|");
		float score4 = scn.nextFloat();
		System.out.print("���Z��");
		float score5 = scn.nextFloat();
		System.out.print("���Z��");
		float score6 = scn.nextFloat();

		System.out.println("�п�J�U�Ǵ����Z");
		System.out.print("���Z�@");
		float score7 = scn.nextFloat();
		System.out.print("���Z�G");
		float score8 = scn.nextFloat();
		System.out.print("���Z�T");
		float score9 = scn.nextFloat();
		System.out.print("���Z�|");
		float score10 = scn.nextFloat();
		System.out.print("���Z��");
		float score11 = scn.nextFloat();

		int c = 0;
		
		if (score1 < 60) {
			c = c + 1;
		}
		if (score2 < 60) {
			c = c + 1;
		}
		if (score3 < 60) {
			c = c + 1;
		}
		if (score4 < 60) {
			c = c + 1;
		}
		if (score5 < 60) {
			c = c + 1;
		}
		if (score6 < 60) {
			c = c + 1;
		}
		int f = 6 * 2 / 3;

		int b = 0;
		if (score7 < 60) {
			b = b + 1;
		}
		if (score8 < 60) {
			b = b + 1;
		}
		if (score9 < 60) {
			b = b + 1;
		}
		if (score10 < 60) {
			b = b + 1;
		}
		if (score11 < 60) {
			b = b + 1;
		}

		int x = 5 * 2 / 3;
		
		if(c>f&&b>x){
		System.out.print("�h��");	
		}else{System.out.print("�b��");	
			
			
			
			
			
			
			
			
		}

	}
}