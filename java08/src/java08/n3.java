package java08;
import java.util.Scanner;
public class n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scn = new Scanner(System.in);
			int i = 1;
			int sum = 0;
			System.out.println("請輸入1個數");
			int n = scn.nextInt();
			
			for(i=1;i<=n;i++){
				
				sum=sum+(i*(i+1));
			
			
			
			
			
			}
			
			
			System.out.print(sum);
			
			
	}

}
