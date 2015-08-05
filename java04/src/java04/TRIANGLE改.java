package java04;
import java.util.Scanner;
public class TRIANGLE改 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
			System.out.println("請輸入三角形邊長,且a<=b<=c");
			System.out.println("請輸入a值");
		float aa = scn.nextFloat();
			System.out.println("請輸入b值");
		float bb = scn.nextFloat();
			System.out.println("請輸入c值");
		float cc = scn.nextFloat();
		if(aa+bb<=cc){
			System.out.print("這是不是個三角形");
		}
		else if(aa*aa+bb*bb==cc*cc){
			System.out.print("這是直角三角形");
		}else if(aa*aa+bb*bb>cc*cc){
			System.out.print("這是頓角三角形");
		}else if(aa*aa+bb*bb<cc*cc){
			System.out.print("這是銳角三角形");
		}
		
		
		
		
	
	
}
}