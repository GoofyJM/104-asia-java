package java04;
import java.util.Scanner;
public class TRIANGLE�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
			System.out.println("�п�J�T�������,�Ba<=b<=c");
			System.out.println("�п�Ja��");
		float aa = scn.nextFloat();
			System.out.println("�п�Jb��");
		float bb = scn.nextFloat();
			System.out.println("�п�Jc��");
		float cc = scn.nextFloat();
		if(aa+bb<=cc){
			System.out.print("�o�O���O�ӤT����");
		}
		else if(aa*aa+bb*bb==cc*cc){
			System.out.print("�o�O�����T����");
		}else if(aa*aa+bb*bb>cc*cc){
			System.out.print("�o�O�y���T����");
		}else if(aa*aa+bb*bb<cc*cc){
			System.out.print("�o�O�U���T����");
		}
		
		
		
		
	
	
}
}