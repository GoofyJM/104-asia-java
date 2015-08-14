package java10;
import java.util.Scanner;
public class method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數n");
		int n = scn.nextInt();
		System.out.println(fun1(n));
	}
	
	public static long fun1(int n) {
		int sum =0;
		for(int i =1; i<=n;i++){
			sum = sum+(i*(i+1));
		}
		return sum;
		
		
		
		
		
		

	}

}
