package test.main;

import test.mypac.Member;

public class MainClass03 {
/*
 * 한명의 회원 정보를 담을 수 있는 객체를 생성할 Member 클래스를 test.mypac에
 *  
 *
 */
	public static void main(String[] args) {
		//Member클래스로 객체를 생성해서 참조값을 m1이라는 지역 변수에 담으시오.
		Member m1=new Member();
		//m1의 참조값을 이용해서 1,김구라,노량진 정보를 객체에 저장.
		m1.num=1;
		m1.name="김구라";
		m1.addr="노량진";
		/*
		 * let m1={};
		 * m1.num=1;
		 * m1.name="김구라";
		 * m1.addr="노량진";
		 *	or
		 *let m1={num:1,name="김구라",addr="노량진"};
		 */
		// 2,"해골","행신동" 이라는 회원정보도 Member객체에 담아봐요.
		Member m2=new Member();
		m2.num=2;
		m2.name="해골";
		m2.addr="행신동";
		//m1의 참조값을 이용해 콘솔창에 김구라의 정보를 출력해보자.
		// 번호:1,이름:김구라,주소:노량진
		System.out.println("번호:"+m1.num+" 이름:"+m1.name+" 주소:"+m1.addr);
		
	}		
}
