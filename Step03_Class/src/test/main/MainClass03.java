package test.main;

import test.mypac.Member;

public class MainClass03 {
/*
 * �Ѹ��� ȸ�� ������ ���� �� �ִ� ��ü�� ������ Member Ŭ������ test.mypac��
 *  
 *
 */
	public static void main(String[] args) {
		//MemberŬ������ ��ü�� �����ؼ� �������� m1�̶�� ���� ������ �����ÿ�.
		Member m1=new Member();
		//m1�� �������� �̿��ؼ� 1,�豸��,�뷮�� ������ ��ü�� ����.
		m1.num=1;
		m1.name="�豸��";
		m1.addr="�뷮��";
		/*
		 * let m1={};
		 * m1.num=1;
		 * m1.name="�豸��";
		 * m1.addr="�뷮��";
		 *	or
		 *let m1={num:1,name="�豸��",addr="�뷮��"};
		 */
		// 2,"�ذ�","��ŵ�" �̶�� ȸ�������� Member��ü�� ��ƺ���.
		Member m2=new Member();
		m2.num=2;
		m2.name="�ذ�";
		m2.addr="��ŵ�";
		//m1�� �������� �̿��� �ܼ�â�� �豸���� ������ ����غ���.
		// ��ȣ:1,�̸�:�豸��,�ּ�:�뷮��
		System.out.println("��ȣ:"+m1.num+" �̸�:"+m1.name+" �ּ�:"+m1.addr);
		
	}		
}
