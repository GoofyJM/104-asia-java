package java11;
import java.util.Random;
import java.util.Scanner;
public class fac01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int user=rnd.nextInt(999)+1;
		int n =  1000-user;
		int s[]=fac(n);
		System.out.println("�`�@"+user);
		System.out.println("���A1000");
		System.out.println("��A"+n);
		System.out.println("��A"+s[0]+"��500");
		System.out.println(s[1]+"��100");
		System.out.println(s[2]+"��50");
		System.out.println(s[3]+"��10��");
		System.out.println(s[4]+"��5��");
		System.out.println(s[5]+"��1��");
	
		
	}
	public static int[] fac(int n){	
		Random rnd = new Random();
		
		int aa[]=new int[6];
		while(n>0){
			aa[0] = n/500;
			n = n%500;
			aa[1] = n/100;
			n = n%100;
			aa[2] = n/50;
			n = n%50;
			aa[3]= n/10;
			n = n%10;
			aa[4] = n/5;
			n = n%5;
			aa[5] = n/1;
			n = n%1;
			
			
		}
		return aa;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
