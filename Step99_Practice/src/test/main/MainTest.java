package test.main;

import test.mypac.Car;
import test.mypac.Member;

public class MainTest {
	public static void main(String[] args) {
		//Member클래스를 불러오고 사용할 수 있게 변수에 담아주기
			//변수의 타입은 당연히 Member타입이 됨
		Member m1=new Member();
		//heap영역에 Member 객체 생성됨.id=27
		m1.num=1;
		m1.name="피카츄";
		m1.type="전기";
		m1.showInfo();
		//new Member();로 Member를 찍어낼 수 있다.

		Member m2=new Member();
		
		//heap영역에 Member 객체 생성됨. id=35
		m2.num=2;
		m2.name="라이츄";
		m2.type="전기";
		m2.showInfo();
		Car c2=m2.getCar();
		c2.name=m2.name;
		c2.drive();
	
	}
}
