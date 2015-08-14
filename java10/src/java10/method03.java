package java10;
import java.util.Scanner;
public class method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數n");
		int n = scn.nextInt();
		double sum=0;
		for(int i=1 ; i<=n ; i++){
			sum += fun1(i);
		}
		System.out.println(sum);
	}
	

	public static double fun1(int n){
		double ans = (double) (1.0/((2*n-1)*2*n));
		return ans;
	}
}
