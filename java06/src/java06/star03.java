package java06;
import java.util.Scanner;
public class star03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入星星數");
		int num = scn.nextInt();
		char star = '*';
		
		double v1=Math.ceil(num/2);
		double v2=num-v1;
		
		for (int i = 1; i <= v1; i = i + 1) {

			for (int k = 1; k < v1 - i+3 ; k = k + 1) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j = j + 1) {
				System.out.print(star);
			}
			System.out.println("");
				
		}
		for (int i = 1; i <= v2;i=i+1 ) {

			for (int k = 1; k < i+1 ; k = k + 1) {
				System.out.print(" ");
			}
			for (int j = 1; j < (v2-i)*2+2; j = j + 1) {
				System.out.print(star);
			}
			System.out.println("");
		
	
		
		
		
		
	

}}}
