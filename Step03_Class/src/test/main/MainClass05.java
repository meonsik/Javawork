package test.main;

import test.mypac.Rect;

/*
 * Rect��� �̸��� Ŭ������ ����� �ʹ�.
 * 
 * �ش� Ŭ������ ��ü�� �����ϰ�
 * 
 * �簢���� ��(width)�� ����(height)�� �ʵ忡 �����ϰ�
 * 
 *  showArea()�� ȣ���ϸ� �簢���� ���̸� �ܼ�â�� ����ϱ�.
 * 
 */

public class MainClass05 {

	
	public static void main(String[] args) {
		//class�� �ҷ���
		Rect r1=new Rect();
		r1.width=1234;
		r1.height=5678;
		r1.showArea();
		//�޼ҵ尡 ������ �ִ� ���� ������ ��ƺ���
		int area=r1.getArea(); //ȣ�� �� intŸ������ �ٲ��.
	}
}
