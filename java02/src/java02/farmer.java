package java02;
import java.util.Scanner;
public class farmer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�����R�F�@���A�a�A���D���X���褽�ض�");
		float mm = scn.nextFloat();
		double pin = mm*0.3025;	
		System.out.println("���o�ˬO"+pin+"�W�O");
		System.out.println("���@�W�R���O");
		float money = scn.nextFloat();
		double much = money*pin;
		System.out.println("���L�`�@�R�F"+much+"��");
	}

}
