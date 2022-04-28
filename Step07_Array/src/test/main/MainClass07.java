package test.main;
/*
 * 1. cherry,apple,banana,melon,7
 * 	5개의 문자열 중에서 1개가 랜덤하게 출력되도록
 * 
 * 2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되도록
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
		//for문을 돌리면 for문 안에서 ranNum값이 바뀌는 것을 이용할 수도 있겠네.
			//for문이 한번 돌때마다 ram변수가 생성되고 각각 랜덤값을 얻어냄.
		for(int i=0;i<3;i++) {
			int ram=ran.nextInt(slot.length);
			slot[i]=slot[ram];
			System.out.println(slot[i]);
		}
		
		
	}
}
