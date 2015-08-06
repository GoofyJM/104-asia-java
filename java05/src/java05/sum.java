package java05;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("À°§Aºâ13+14+...+1399");
		System.out.println("½Ð¿é¤J13");
		int n = scn.nextInt();
		
		
		int sum = 0;
		int i;
		for(i=n;i<1400;i=i+1){
			sum = sum + i;
}		
		System.out.println(sum);
		
		
		
		
		
	
		
	}

}
