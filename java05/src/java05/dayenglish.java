package java05;
import java.util.Scanner;
public class dayenglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入日期");
		int day = scn.nextInt();
		switch(day){
		case 1:
			System.out.println("星期"+day+"的英文是Momday");
		break;
		case 2:
			System.out.println("星期"+day+"的英文是Tuesday");
		break;
		case 3:
			System.out.println("星期"+day+"的英文是Wednesday");
		break;
		case 4:
			System.out.println("星期"+day+"的英文是Thursday");
		break;
		case 5:
			System.out.println("星期"+day+"的英文是Friday");
		break;
		case 6:
			System.out.println("星期"+day+"的英文是Saturday");
		break;
		case 7:
			System.out.println("星期"+day+"的英文是Sunday");
		break;
		default:
			System.out.println("沒有這個日期智障");
		}
		
		
		
		
			
	}

}
