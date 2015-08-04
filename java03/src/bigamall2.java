
import java.util.Scanner;
public class bigamall2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入a值");
		float big = scn.nextFloat();
		System.out.print("請輸入b值");
		float small = scn.nextFloat();
		System.out.print("你所要做的運算是+,-,*或 / ?");
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
