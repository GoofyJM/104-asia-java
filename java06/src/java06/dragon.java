package java06;
import java.util.Scanner;
public class dragon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int m = 0;
		int weight =0;
		while (weight<600) {
			System.out.println("請輸入龍眼重量");
			int k = scn.nextInt();
			weight = weight + k;
			m++;
		}
		System.out.print("阿瑞採了"+m+"顆龍眼樹現在為"+weight+"斤");
		
		
		
		
		
	}

}
