
package test.main;

import test.mypac.HandPhone;
/*
 * PhoneŬ������ ��ӹ��� HandPhoneŬ������ ��ü�� �����ϸ�
 * Phone��ü�� �̸� ��������� HandPhone��ü�� ���������
 * 
 * �׸��� �� �ΰ��� ��ü�� ������ heap������ ����Ǿ ������ ���������� ����..
 */
public class MainClass01 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		p1.call(); //Phone���κ��� ��ӹ��� ����� ����� �� �ִ�.
		p1.mobileCall();
		p1.takePicture();
		// �θ�ü�� heap�� ���� ��������� ������ Phone ������ ��ȣ��.
		
		
	}
}
