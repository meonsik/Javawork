package test.main;

import test.mypac.Myutil;

public class MainClass02 {
	
	
	public static String myName="�豸��";
	
	public static void test() {
		System.out.println("test() ȣ���");
}
	
	public static void main(String[] args) {				
		Myutil.v=1.0;
		Myutil.version=Myutil.v+"";
		Myutil.send();
		System.out.println(MainClass02.myName);
		MainClass02.test(); //this�� �Ұ���
		//this�� heap������ �����Ǵ� ��ü�� ���� ��.
		//���������� ���� ��ü�� this�� �ҷ��� �� ����.
		//MainClass02.�� ������ �� �ִ� ������?
		//���� ���� �ȿ� �����ϱ� ������.
	}

}
