package java05;
import java.util.Scanner;
public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("幫你算13+14+...+1399的奇數");
		System.out.println("請輸入13");
		int a = scn.nextInt();
		int sum = 0;
		int i;
		if(a%2==0){
		for(i=a+1;i<1400;i=i+2){
			sum=sum+i;
		}}else{
		for(i=a;i<1400;i=i+2){
				sum=sum+i;
		}
		System.out.print("sum是"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

}
