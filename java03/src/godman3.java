import java.util.Scanner;
public class godman3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入車的傾角");
		float ag = scn.nextFloat();
		System.out.print("請輸入兩輪軸心之軸距");
		float car = scn.nextFloat();
		System.out.print("請輸入輪胎尺寸");
		float cm = scn.nextFloat();
		if(ag<43&&car<130&&cm==12){
			System.out.print("就買吧");
		}else{	
			System.out.print("不要買");
		}
		
		
		
		
	}

}
