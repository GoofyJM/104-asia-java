package java08;
import java.util.Scanner;
import java.util.Random;
public class mostbigandsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[3];
		int n = 3;
		int i = 0;
		int j = 0;

		
		boolean flag = false;

		while(i<3){
			data[i] = (rnd.nextInt(99)+1);
			flag = false;
			for(j =0;j<i;j++){
				if(data[i]==data[j]){
				flag = true;	
					
				}
			}
			if(flag==false){
				i++;
			}
		}
		
		
		
		
		for (i = 0; i < n; i = i + 1) {
		
			for (j = i + 1; j < n; j = j + 1) {

				if (data[i] > data[j]) {
					int v1 = data[i];
					data[i] = data[j];
					data[j] = v1;
					
				}
			}
		}
		for (i = 0; i < n; i = i + 1) {
			System.out.println(data[i]);
		
		}
		System.out.println("最小值是"+data[0]);
		System.out.println("最大值是"+data[2]);
	}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


