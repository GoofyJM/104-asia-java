


import java.util.Scanner;
public class bigsmall {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入a值");
		float big = scn.nextFloat();
		System.out.print("請輸入b值");
		float small = scn.nextFloat();
		if (big>small)
		{System.out.println(big+">"+small);
		}
		else{
		if (big==small)
		{System.out.println(big+"="+small);
		}
		else{
		if (big<small)	
		System.out.println(big+"<"+small);
		}
		
		
		
		
		}
	}

}
