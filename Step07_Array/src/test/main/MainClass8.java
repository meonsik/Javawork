package test.main;
/*
 * 1. cherry,apple,banana,melon,7
 * 	5���� ���ڿ� �߿��� 1���� �����ϰ� ��µǵ���
 * 
 * 2. 5���� ���ڿ� �߿��� 3���� ���ٿ� �ѹ��� �����ϰ� ��µǵ���
 * 
 * 
 * 
 */

import java.util.Random;

public class MainClass8 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		//String�� ����������
		String[] slot= {"cherry","apple","banana","melon","7"};
		//�����迭
		int[] points = {10,20,30,40,1000};
		int jumsu=0;
		
		int num1=ran.nextInt(slot.length);
		int num2=ran.nextInt(slot.length);
		int num3=ran.nextInt(slot.length);
		System.out.println(slot[num1]+slot[num2]+slot[num3]);
		//for���� ������ for�� �ȿ��� ranNum���� �ٲ�� ���� �̿��� ���� �ְڳ�.
			//for���� �ѹ� �������� ram������ �����ǰ� ���� �������� ��.
		for(int i=0;i<3;i++) {
			int ram=ran.nextInt(slot.length);
			slot[i]=slot[ram];
			System.out.println(slot[i]);			
		}
		//����. ������ ������ ������
		if(num1==num2 && num2==num3) {
			jumsu=points[num1];
		}else {
			
		}
		System.out.println("jumsu: "+jumsu);
		
	}
}
