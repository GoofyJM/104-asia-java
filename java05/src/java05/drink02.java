package java05;
import java.util.Scanner;
public class drink02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���a�W��");
		String name = scn.next();
		System.out.print("�п�J���ƦW��");
		String drink = scn.next();
		System.out.print("�п�J���B");
		int money = scn.nextInt();
		switch(name){
			case"���Q�P":
			System.out.println("�N���R");
			break;
		default:
			switch(drink){
			case"�@��":
				System.out.println("�N�R�a");
			break;
			case"���":
				System.out.println("�N�R�a");
			break;
			default:
			
			if(money<=45){
			System.out.println("�N�R�a");
			}else{
				System.out.println("�N���R");
			}
			
			
			
			
			}
		}
		
		
		
		
		
		
	}

}
