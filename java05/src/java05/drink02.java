package java05;
import java.util.Scanner;
public class drink02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入店家名稱");
		String name = scn.next();
		System.out.print("請輸入飲料名稱");
		String drink = scn.next();
		System.out.print("請輸入金額");
		int money = scn.nextInt();
		switch(name){
			case"五十嵐":
			System.out.println("就不買");
			break;
		default:
			switch(drink){
			case"咖啡":
				System.out.println("就買吧");
			break;
			case"綠茶":
				System.out.println("就買吧");
			break;
			default:
			
			if(money<=45){
			System.out.println("就買吧");
			}else{
				System.out.println("就不買");
			}
			
			
			
			
			}
		}
		
		
		
		
		
		
	}

}
