package java04;
import java.util.Scanner;
public class twoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個整數");
		System.out.println("第一個是?");
		int one = scn.nextInt();
		System.out.println("第二個是?");
		int two = scn.nextInt();
		float and = one+two;
		float delet = one-two;
		float mix = one*two;
		System.out.println("其合為"+and);
		System.out.println("其差為"+delet);
		System.out.println("其乘積為"+mix);
		
		
		
		
	}

}
