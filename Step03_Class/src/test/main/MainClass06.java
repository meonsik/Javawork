package test.main;

import test.mypac.Car;
import test.mypac.CarFactory;

/*
 * CarFactory��� �̸��� Ŭ������ ������.
 * 
 * CarFactory ��ü�� getCar()��� �޼ҵ尡 �ְ�
 * 
 * �ش� �޼ҵ带 ȣ���ϸ� Car type ��ü�� �������� �����ϵ��� �޼ҵ带 ��������.
 */
public class MainClass06 {
	public static void main(String[] args) {
		CarFactory cf= new CarFactory();
		Car c=cf.getCar();
		c.name="�۸�";
		c.drive();
	}
	
}
