package test.main;

import java.util.Random; //import����?
//������ ���ؼ� ��ü ���赵�� �ҷ�����

public class Quiz {
	public static void main(String[] args) {
		/*
		 * ������ ������ ���ڸ� ���� ������
		 * Random��ü Ȱ��
		 * new Random ��ü ������
		 * ��ü �޼ҵ� �̿��� ������ ���� ���
		 * 
		 */
		 //0~10 �������� �ϳ� ranNum ������
		int ranNum1=new Random().nextInt(11);
		System.out.println(ranNum1);
		 //1~45 �������� ranNum2
		int ranNum2=new Random().nextInt(45)+1;
		System.out.println(ranNum2);
		 //true false �߿� ���� boolean isRun������
		boolean isRun=new Random().nextBoolean();
		System.out.println(isRun);
		//��ü�� 1�� ������ (new Random)
		//������ 4�� ������ (���������� Random ran�� �⺻����Ÿ 3�� int int bool)
	}
}
