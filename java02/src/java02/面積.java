package java02;
import java.util.Scanner;

public class 面積 {

	
		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("算個三角形面積吧，先輸入底再高");
		System.out.println("底是?");
		float pp = scn.nextFloat();
		System.out.println("底是"+pp);
		System.out.println("高呢?");
		float qq = scn.nextFloat();
		System.out.println("高是"+qq);
		float answer = pp*qq/2;
		System.out.println("那你所求的三角形面積是"+answer);
		
		
		}
		
		
		
}
