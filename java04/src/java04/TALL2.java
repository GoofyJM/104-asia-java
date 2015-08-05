package java04;
import java.util.Scanner;
public class TALL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別");
		String sex = scn.next();
		System.out.println("請輸入身高");
		float tall = scn.nextFloat();
		double boy = (tall-170)*0.6+62;
		double girl = (tall-158)*0.5+52;
		if(sex.equals("男")){
			System.out.print("標準體重"+boy);
		}else if(sex.equals("女")){
			System.out.print("標準體重"+girl);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
