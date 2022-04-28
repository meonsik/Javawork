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

public class MainClass8 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		//String도 참조데이터
		String[] slot= {"cherry","apple","banana","melon","7"};
		//점수배열
		int[] points = {10,20,30,40,1000};
		int jumsu=0;
		
		int num1=ran.nextInt(slot.length);
		int num2=ran.nextInt(slot.length);
		int num3=ran.nextInt(slot.length);
		System.out.println(slot[num1]+slot[num2]+slot[num3]);
		//for문을 돌리면 for문 안에서 ranNum값이 바뀌는 것을 이용할 수도 있겠네.
			//for문이 한번 돌때마다 ram변수가 생성되고 각각 랜덤값을 얻어냄.
		for(int i=0;i<3;i++) {
			int ram=ran.nextInt(slot.length);
			slot[i]=slot[ram];
			System.out.println(slot[i]);			
		}
		//점수. 세개의 슬롯이 같으면
		if(num1==num2 && num2==num3) {
			jumsu=points[num1];
		}else {
			
		}
		System.out.println("jumsu: "+jumsu);
		
	}
}
