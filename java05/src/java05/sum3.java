package java05;
import java.util.Scanner;
public class sum3 {
	Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn= new Scanner(System.in);
		System.out.println("幫你算13+14+...+1399數值裡面是17的倍數數值");
		System.out.println("請輸入13");
		int a = scn.nextInt();
		int sum = 0;
		int i;
		for(i=a;i<1400;i=i+17){
			sum=sum+i;
		}
			System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	

}
