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

public class MainClass07 {
	public static void main(String[] args) {
		Random ran=new Random();
		String[] slot= {"cherry","apple","banana","melon","7"};
		int ranNum=ran.nextInt(slot.length);
		System.out.println(slot[ranNum]);
		
		int ranNum1=ran.nextInt(slot.length);
		int ranNum2=ran.nextInt(slot.length);
		int ranNum3=ran.nextInt(slot.length);
		System.out.println(slot[ranNum1]+slot[ranNum2]+slot[ranNum3]);
		//for���� ������ for�� �ȿ��� ranNum���� �ٲ�� ���� �̿��� ���� �ְڳ�.
			//for���� �ѹ� �������� ram������ �����ǰ� ���� �������� ��.
		for(int i=0;i<3;i++) {
			int ram=ran.nextInt(slot.length);
			slot[i]=slot[ram];
			System.out.println(slot[i]);
		}
		
		
	}
}
