package java13;
import java.util.Scanner;
public class fun05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個數");
		int n = scn.nextInt();
		System.out.println("請輸入要轉換成的進位數 1<b<10");
		int b = scn.nextInt();
		System.out.println(fun(n,b));
	}
	public static String fun(int n,int b){
		int a[] = new int[50] ;
		int i=0;
		while(n>=b){
			a[i] = n%b;
			n = n/b;
			i++;
		}
		a[i]=n;
		for(int j = i; j>=0;j--){
		System.out.print(a[j]);
		}
		
		
		return "";
		
		
		
		
		
	}
	
}
