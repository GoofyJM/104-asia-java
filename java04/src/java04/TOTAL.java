package java04;
import java.util.Scanner;
public class TOTAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�п�J��妨�Z");
		float chinese = scn.nextFloat();
		System.out.println("�п�J�^�妨�Z");
		float english = scn.nextFloat();
		System.out.println("�п�J�ƾǦ��Z");
		float math = scn.nextFloat();
		float total = (chinese+english+math);
		float nottotal = ((chinese+english+math)/3);
		System.out.println("�`���Ƭ�"+total);
		System.out.println("�������Ƭ�"+nottotal);
		
		
		
		
		
		
		
		
	}

}
