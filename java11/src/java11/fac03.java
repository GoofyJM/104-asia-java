package java11;
import java.util.Scanner;
public class fac03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn  = new Scanner(System.in);
		
		System.out.println("�п�J�@��Ʀr");
		String n =scn.next();
		System.out.println(fac(n));
	}
	public static int fac(String n) {
		
		int sum = 0;
		char a[]=n.toCharArray();	
		for(int i=0;i<a.length;i++){
			sum = sum +1;
	
		}
		return sum;
		
		
		
		
		
		}
	
	

	}


