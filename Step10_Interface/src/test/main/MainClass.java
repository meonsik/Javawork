package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass {	
	public static void main(String[] args) {
	//	 	Remocon r=new Remocon();//�������̽��� ��ü�� �ܵ������� �� ����.	
			Remocon r1=new MyRemocon();	//������ �ʿ��ϸ� Ŭ�������� ��ߵ�.
		//Remocon�� �������̽��� ����(implements)�� Ŭ������ �̿��ؼ� Remocon type�� ������ ���
		r1.up(); r1.down();
		//�������̽��� �ʵ� ���� (static final)
		String result=Remocon.COMPANY;
}
}