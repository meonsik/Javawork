package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
//SmartPhone ��ü�� �����ؼ� Phone type p1�̶�� ���������� ��ƺ�����.
		Phone p1=new SmartPhone();
		p1.call();
		//p1�������� �̿��ؼ� �̵� �� ��ȭ�� �ϰ� �ʹٸ�??
			//HandPhone�� ����� �ʿ��ѵ� p1�� ���ѵ� ������ ������ �ִ�.
		//Casting�ʿ� - byte a=(byte)aInt; �̷� ����.
		HandPhone p2=(HandPhone)p1;
		// p1�� p2�� �������� ����. �׷��� ������ �ٸ� ��.
		SmartPhone p3=(SmartPhone)p1;
		p3.doInternet();
	}
}
