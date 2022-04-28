package test.main;

import java.util.Random; //import이유?
//랜덤을 위해서 객체 설계도를 불러오기

public class Quiz {
	public static void main(String[] args) {
		/*
		 * 랜덤한 무작위 숫자를 얻어내고 싶으면
		 * Random객체 활용
		 * new Random 객체 생성후
		 * 객체 메소드 이용해 무작위 숫자 얻기
		 * 
		 */
		 //0~10 랜덤정수 하나 ranNum 변수에
		int ranNum1=new Random().nextInt(11);
		System.out.println(ranNum1);
		 //1~45 랜덤정수 ranNum2
		int ranNum2=new Random().nextInt(45)+1;
		System.out.println(ranNum2);
		 //true false 중에 랜덤 boolean isRun변수에
		boolean isRun=new Random().nextBoolean();
		System.out.println(isRun);
		//객체는 1개 생성됨 (new Random)
		//변수는 4개 생성됨 (참조데이터 Random ran과 기본데이타 3개 int int bool)
	}
}
