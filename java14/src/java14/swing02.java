package java14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class swing02 extends JFrame {

	Scanner scn = new Scanner(System.in);
	private JButton jbtnExit = new JButton("Exit"); // ���}���s
	private JButton jbtnchange = new JButton("change");// �ഫ���s
	private JLabel jlb1 = new JLabel();// ���Ҫ���
	private Container cp; // �ŧi�@�ӵ����e��
	private String str = "���׬� :";
	private String str1 = "�ؤ�׬� :";
	private JTextField jtf = new JTextField(); //---��J��r���خ�

	public swing02() { // �������O���غc��
		initComp(); // �I�sinitComp�禡�Hø�s�����Ҧ�
	}

	private void initComp() {
		cp = this.getContentPane();// ���o�������e���Ψө�m�U�ت���

		this.setBounds(150, 100, 600, 400);// �]�w���Ҫ���b�������_�l��m�P�����j�p
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// �]�w������X�N����
		cp.setLayout(null);// ���A�ε����G�����O

		// -------�]�w����---------
		jlb1.setBounds(50, 70, 250, 25);//
		jlb1.setText(str);// ��ܼ��ҤW���r
		cp.add(jlb1); // �N���ҥ[�J������
		//----------��J��
		jtf.setLocation(50,100);
		jtf.setSize(100,20);
		cp.add(jtf);
		
		// ---------change���s
		jbtnchange.setBounds(50, 150, 80, 25); // �]�wchange���s�b�������_�l��m�P�����j�p
		cp.add(jbtnchange);//�Npush�s�[�J������e����
		jbtnchange.addActionListener(new ActionListener(){//��change���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae){
				String c = jtf.getText();
				float f = fun(c);
				jlb1.setText(f+"f");//��s���ҤW���r
				
			}
		});
				
			//-------�]�wEXIT�s----
		jbtnExit.setBounds(50,200,80,25);//�]�wEXIT���s�b�������_�l��m�P�����j�p
		cp.add(jbtnExit);//�NEXIT�s�[�J������e����
		jbtnExit.addActionListener(new ActionListener(){//��Exit���s�[�W�ƥ�B�z
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
