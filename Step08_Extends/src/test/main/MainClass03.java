
package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
//HandPhone��ü�� �����ؼ� �� �������� p1�̶�� �̸��� HandPhone type���������� ����
		HandPhone p1=new HandPhone();		
//Phone type�� ���� ������ �غ� �ص� ��.
//p2��� �̸��� Phone type ���������� null�� �ֱ�.
		Phone p2=null;
		//p1 �ȿ� �ִ� �������� p21��� Phone type���� ������ �����ϱ�.
		Phone p21=p1;
		//p1 �ȿ� �ִ� �������� p3��� Object type���� ������ �����ϱ�.
		Object p3=p1;
		/*
		 * �ڽ� ��ü�� �������� �θ� type ������ �ʵ忡 �ڿ������� ����.
		 */
		
	}
}
