package java12;

import java.util.Scanner;

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("歡迎光鈴亞大武器店");
		System.out.println("我們這裡有賣");
		System.out.println("惡鬼槌        100.85元");
		System.out.println("雷神釜        100.85元");
		System.out.println("破魔劍           98.25元");
		System.out.println("");
		System.out.println("請問你要買幾樣商品呢");
		int n = scn.nextInt();
		Course cousdata[] = new Course[n];
		for (int i = 0; i < n; i++) {
			System.out.println("請輸入要買的商品");
			String 武器=scn.next();
			System.out.println("請輸入數量");

			cousdata[i] = new Course(武器,null,0,scn.nextInt());
			System.out.println("");
			System.out.println("");
			System.out.println("");

		}

		String str = "Y";
		int x, z;

		while (str.equals("Y") || str.equals("y")) {

			System.out.println("功能項目:");
			System.out.println("1:查詢第幾筆資料");
			System.out.println("2:列印購物資訊");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.println("你要查詢第幾個商品");
				z = scn.nextInt();
				cousdata[z].showinfo();
				break;
			case 2:
				System.out.println("你要列印第幾個商品");
				z = scn.nextInt();
				System.out.println("              發票(亞洲資工站)");
				System.out.println("");
				System.out.println("台中市霧峰區柳豐路500號");
				System.out.println("電話:04-23323456#6101");
				System.out.println("傳真:04-23233876");
				System.out.println("=============================");
				System.out.println("品項名稱                單價                  數量                 小計");
				System.out.println("-----------------------------");
				System.out.println(cousdata[z].get武器());
				System.out.println("==============================");
				System.out.println("合計:");
				
				break;
			default:
				System.out.println("無此功能");
			}

			System.out.println("是否繼續 (Y/N)");
			str = scn.next();
		}
		System.out.println("謝謝光臨本店");

	}

}

//--------------course類別------------------

class Course {
	private String cous武器,coustitle;
	private int cous價格,cous數量;
	
	public Course(String 武器,String title,int 價格 ,int 數量){
		coustitle = title;
		cous武器 = 武器;
		cous價格 = 價格;
		cous數量 = 數量;
	}
	public void settitle(String str){
		coustitle = str;
	}
	public String gettitle(){
		return coustitle;
	}
	public void set武器(String str){
		cous武器 = str;
	}
	public String get武器(){
		return cous武器;
	}
	public void set價格(int str){
		cous價格 = str;
	}
	public int get價格(){
		return cous價格;
	}
	public void set數量(int str){
		cous數量 = str;
	}
	public int get數量(){
		return cous數量;
	}
	public void showinfo(){
		System.out.println("購買的武器:"+cous武器);
		System.out.println("購買的數量"+cous數量);
		System.out.println("購買的價格"+cous價格);
	}
	
	
	
	
}

















