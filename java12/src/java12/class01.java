package java12;

import java.util.Scanner;

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�w����a�Ȥj�Z����");
		System.out.println("�ڭ̳o�̦���");
		System.out.println("�c���l        100.85��");
		System.out.println("�p���y        100.85��");
		System.out.println("�}�]�C           98.25��");
		System.out.println("");
		System.out.println("�аݧA�n�R�X�˰ӫ~�O");
		int n = scn.nextInt();
		Course cousdata[] = new Course[n];
		for (int i = 0; i < n; i++) {
			System.out.println("�п�J�n�R���ӫ~");
			String �Z��=scn.next();
			System.out.println("�п�J�ƶq");

			cousdata[i] = new Course(�Z��,null,0,scn.nextInt());
			System.out.println("");
			System.out.println("");
			System.out.println("");

		}

		String str = "Y";
		int x, z;

		while (str.equals("Y") || str.equals("y")) {

			System.out.println("�\�ඵ��:");
			System.out.println("1:�d�߲ĴX�����");
			System.out.println("2:�C�L�ʪ���T");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.println("�A�n�d�߲ĴX�Ӱӫ~");
				z = scn.nextInt();
				cousdata[z].showinfo();
				break;
			case 2:
				System.out.println("�A�n�C�L�ĴX�Ӱӫ~");
				z = scn.nextInt();
				System.out.println("              �o��(�Ȭw��u��)");
				System.out.println("");
				System.out.println("�x�������p�Ϭh�׸�500��");
				System.out.println("�q��:04-23323456#6101");
				System.out.println("�ǯu:04-23233876");
				System.out.println("=============================");
				System.out.println("�~���W��                ���                  �ƶq                 �p�p");
				System.out.println("-----------------------------");
				System.out.println(cousdata[z].get�Z��());
				System.out.println("==============================");
				System.out.println("�X�p:");
				
				break;
			default:
				System.out.println("�L���\��");
			}

			System.out.println("�O�_�~�� (Y/N)");
			str = scn.next();
		}
		System.out.println("���¥��{����");

	}

}

//--------------course���O------------------

class Course {
	private String cous�Z��,coustitle;
	private int cous����,cous�ƶq;
	
	public Course(String �Z��,String title,int ���� ,int �ƶq){
		coustitle = title;
		cous�Z�� = �Z��;
		cous���� = ����;
		cous�ƶq = �ƶq;
	}
	public void settitle(String str){
		coustitle = str;
	}
	public String gettitle(){
		return coustitle;
	}
	public void set�Z��(String str){
		cous�Z�� = str;
	}
	public String get�Z��(){
		return cous�Z��;
	}
	public void set����(int str){
		cous���� = str;
	}
	public int get����(){
		return cous����;
	}
	public void set�ƶq(int str){
		cous�ƶq = str;
	}
	public int get�ƶq(){
		return cous�ƶq;
	}
	public void showinfo(){
		System.out.println("�ʶR���Z��:"+cous�Z��);
		System.out.println("�ʶR���ƶq"+cous�ƶq);
		System.out.println("�ʶR������"+cous����);
	}
	
	
	
	
}

















