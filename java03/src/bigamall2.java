
import java.util.Scanner;
public class bigamall2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�Ja��");
		float big = scn.nextFloat();
		System.out.print("�п�Jb��");
		float small = scn.nextFloat();
		System.out.print("�A�ҭn�����B��O+,-,*�� / ?");
		String and = scn.next();
		float answer = 0;
		if (and.equals("+")){
			answer = big+small;
			System.out.print(answer);
		}else if (and.equals("-")){	
			answer = big-small;
			System.out.print(answer);
		}else if (and.equals("*")){
			answer = big*small;
			System.out.print(answer);
		}else if (and.equals("/")){
			answer=big/small;
			System.out.print(answer);
		}
	}
}
