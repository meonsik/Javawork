package test.main;

import test.mypac.Car;
import test.mypac.Member;

public class MainTest {
	public static void main(String[] args) {
		//MemberŬ������ �ҷ����� ����� �� �ְ� ������ ����ֱ�
			//������ Ÿ���� �翬�� MemberŸ���� ��
		Member m1=new Member();
		//heap������ Member ��ü ������.id=27
		m1.num=1;
		m1.name="��ī��";
		m1.type="����";
		m1.showInfo();
		//new Member();�� Member�� �� �� �ִ�.

		Member m2=new Member();
		
		//heap������ Member ��ü ������. id=35
		m2.num=2;
		m2.name="������";
		m2.type="����";
		m2.showInfo();
		Car c2=m2.getCar();
		c2.name=m2.name;
		c2.drive();
	
	}
}
