package java05;
import java.util.Scanner;
public class dayenglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���");
		int day = scn.nextInt();
		switch(day){
		case 1:
			System.out.println("�P��"+day+"���^��OMomday");
		break;
		case 2:
			System.out.println("�P��"+day+"���^��OTuesday");
		break;
		case 3:
			System.out.println("�P��"+day+"���^��OWednesday");
		break;
		case 4:
			System.out.println("�P��"+day+"���^��OThursday");
		break;
		case 5:
			System.out.println("�P��"+day+"���^��OFriday");
		break;
		case 6:
			System.out.println("�P��"+day+"���^��OSaturday");
		break;
		case 7:
			System.out.println("�P��"+day+"���^��OSunday");
		break;
		default:
			System.out.println("�S���o�Ӥ������");
		}
		
		
		
		
			
	}

}
