package java04;
import java.util.Scanner;
public class TOTAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入國文成績");
		float chinese = scn.nextFloat();
		System.out.println("請輸入英文成績");
		float english = scn.nextFloat();
		System.out.println("請輸入數學成績");
		float math = scn.nextFloat();
		float total = (chinese+english+math);
		float nottotal = ((chinese+english+math)/3);
		System.out.println("總分數為"+total);
		System.out.println("平均分數為"+nottotal);
		
		
		
		
		
		
		
		
	}

}
