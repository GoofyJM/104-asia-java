package java02;
import java.util.Scanner;
public class T {
		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("算個梯形形面積吧，先輸入上底,下底底再高");
		System.out.println("上底是?");
		float pp = scn.nextFloat();
		System.out.println("上底是"+pp);
		System.out.println("下底是?");
		float qq = scn.nextFloat();
		System.out.println("下底是"+qq);
		System.out.println("高呢?");
		float zz = scn.nextFloat();
		System.out.println("高是"+zz);
		float answer = (pp+qq)*zz/2;
		System.out.println("那你所求的梯形面積是"+answer);
		
		
		
		
		
		
		
		
}
}