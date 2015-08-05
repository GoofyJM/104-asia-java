package java04;
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
		if(name.equals("五十嵐") || (!drink.equals("綠茶") ||!drink.equals("綠茶")) || money>45){
			System.out.print("不買吧");
		}else{System.out.print("就買吧");
		}
		
		
		
		
		
		
		
	}
	
	
	
}
