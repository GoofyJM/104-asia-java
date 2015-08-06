package java05;
import java.util.Scanner;
public class sum06 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int num = scn.nextInt();
		int i ;
		char star = '*';
		for (i = 1; i <= num; i = i + 1){
			for(int j=1 ; j<=i ; j++){
				System.out.print(star);
			}
			System.out.println("");
		}
	}
}
