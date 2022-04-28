package test.mypac;

public class Student {
	//생성자 (리턴타입이나 static은 붙이지 않고 클래스명과 똑같이 정의하기)
	
	/*
	 * 1.클래스명과 동일
	 * 2.메소드 모양과 유사하지만 리턴 타입은 없음
	 * 3.객체를 생성할 때 (new 할 때 호출된다)
	 * 4.객체를 생성하는 시점에 무언가 준비작업을 할 때 유용.
	 * 5.생성자를 명시적으로 정의하지 않아도 기본 생성자는 있다고 간주.
	 */
	public Student() {
		//여기에 준비작업 할 것들을 작성하기~.
		System.out.println("Student() 클래스의 생성자 호출됨...");
	}
	
	
	//메소드와 비교해보자
	public void study() {
		System.out.println("공부하기");
	}
	public void goSchool() {
		System.out.println("학교가기");
	}
}
