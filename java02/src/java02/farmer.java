package java02;
import java.util.Scanner;
public class farmer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("阿勳買了一塊農地你知道有幾平方公尺嗎");
		float mm = scn.nextFloat();
		double pin = mm*0.3025;	
		System.out.println("那這樣是"+pin+"坪呢");
		System.out.println("那一坪買錢呢");
		float money = scn.nextFloat();
		double much = money*pin;
		System.out.println("那他總共買了"+much+"元");
	}

}
