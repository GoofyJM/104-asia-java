package java04;
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
		if(name.equals("���Q�P") || (!drink.equals("���") ||!drink.equals("���")) || money>45){
			System.out.print("���R�a");
		}else{System.out.print("�N�R�a");
		}
		
		
		
		
		
		
		
	}
	
	
	
}
