package test.main;

import test.mypac.Member;

public class MainClass04 {
	public static void main(String[] args) {
		//1.Member�� ��ü�� �����ؼ�
		Member m1=new Member();
		//2.ȸ�� �Ѹ��� ������ ���
		m1.num=1;
		m1.name="�豸��";
		m1.addr="�뷮��";
		
		//3.showInfo()�޼ҵ带 ����ϱ�.
		m1.showInfo();
	}
}
