package java14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class swing02 extends JFrame {

	Scanner scn = new Scanner(System.in);
	private JButton jbtnExit = new JButton("Exit"); // 離開按鈕
	private JButton jbtnchange = new JButton("change");// 轉換按鈕
	private JLabel jlb1 = new JLabel();// 標籤物件
	private Container cp; // 宣告一個視窗容器
	private String str = "攝氏度為 :";
	private String str1 = "華氏度為 :";
	private JTextField jtf = new JTextField(); //---輸入文字的框框

	public swing02() { // 視窗類別的建構元
		initComp(); // 呼叫initComp函式以繪製視窗模式
	}

	private void initComp() {
		cp = this.getContentPane();// 取得視窗的容器用來放置各種物件

		this.setBounds(150, 100, 600, 400);// 設定標籤物件在視窗的起始位置與視窗大小
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 設定視窗案X就結束
		cp.setLayout(null);// 不適用視窗佈局類別

		// -------設定標籤---------
		jlb1.setBounds(50, 70, 250, 25);//
		jlb1.setText(str);// 顯示標籤上的字
		cp.add(jlb1); // 將標籤加入視窗中
		//----------輸入元
		jtf.setLocation(50,100);
		jtf.setSize(100,20);
		cp.add(jtf);
		
		// ---------change按鈕
		jbtnchange.setBounds(50, 150, 80, 25); // 設定change按鈕在視窗的起始位置與視窗大小
		cp.add(jbtnchange);//將push鈕加入到視窗容器中
		jbtnchange.addActionListener(new ActionListener(){//為change按鈕加上事件處理
			public void actionPerformed(ActionEvent ae){
				String c = jtf.getText();
				float f = fun(c);
				jlb1.setText(f+"f");//更新標籤上的字
				
			}
		});
				
			//-------設定EXIT鈕----
		jbtnExit.setBounds(50,200,80,25);//設定EXIT按鈕在視窗的起始位置與視窗大小
		cp.add(jbtnExit);//將EXIT鈕加入到視窗容器中
		jbtnExit.addActionListener(new ActionListener(){//為Exit按鈕加上事件處理
			public void actionPerformed(ActionEvent ae){
		
				System.exit(0);
			}
		});
		
	}
	public float fun(String jif){
		int c = Integer.parseInt(jif); 
		return (float) (c * 9.0 / 5.0 + 32);
	}

}
