import java.util.Scanner;
public class godman3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�����ɨ�");
		float ag = scn.nextFloat();
		System.out.print("�п�J����b�ߤ��b�Z");
		float car = scn.nextFloat();
		System.out.print("�п�J���L�ؤo");
		float cm = scn.nextFloat();
		if(ag<43&&car<130&&cm==12){
			System.out.print("�N�R�a");
		}else{	
			System.out.print("���n�R");
		}
		
		
		
		
	}

}
