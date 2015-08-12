package java08;
import java.util.Scanner;
public class n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入一個數");
		int n = scn.nextInt();
		int i = 1;
		int sum = 1;
		while(i>0&&i<=n){
		
			sum=sum*i;
		i++;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
