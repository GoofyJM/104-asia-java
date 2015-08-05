
package java04;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入上學期成績");
		System.out.print("成績一");
		float score1 = scn.nextFloat();
		System.out.print("成績二");
		float score2 = scn.nextFloat();
		System.out.print("成績三");
		float score3 = scn.nextFloat();
		System.out.print("成績四");
		float score4 = scn.nextFloat();
		System.out.print("成績五");
		float score5 = scn.nextFloat();
		System.out.print("成績六");
		float score6 = scn.nextFloat();

		System.out.println("請輸入下學期成績");
		System.out.print("成績一");
		float score7 = scn.nextFloat();
		System.out.print("成績二");
		float score8 = scn.nextFloat();
		System.out.print("成績三");
		float score9 = scn.nextFloat();
		System.out.print("成績四");
		float score10 = scn.nextFloat();
		System.out.print("成績五");
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
		System.out.print("退學");	
		}else{System.out.print("在學");	
			
			
			
			
			
			
			
			
		}

	}
}