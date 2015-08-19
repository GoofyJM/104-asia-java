package java13;
import java.util.Scanner;
public class fun03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¤@¦ê¦r");
		String str = scn.nextLine();
		System.out.println(fac(str));
		
	}
		public static String fac(String str){
			
		
		char a[] =str.toCharArray(); 
		int i =a.length;
		for(int n =0;n<i;n++){
			if(a[n]!=32){
				System.out.print(a[n]);
			}
		}
		return "";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
