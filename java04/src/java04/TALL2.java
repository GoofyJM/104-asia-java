package java04;
import java.util.Scanner;
public class TALL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ʧO");
		String sex = scn.next();
		System.out.println("�п�J����");
		float tall = scn.nextFloat();
		double boy = (tall-170)*0.6+62;
		double girl = (tall-158)*0.5+52;
		if(sex.equals("�k")){
			System.out.print("�з��魫"+boy);
		}else if(sex.equals("�k")){
			System.out.print("�з��魫"+girl);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
