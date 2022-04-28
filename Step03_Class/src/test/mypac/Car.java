package test.mypac;
/*
 * 클래스의 역할은 뭘까요?
 * 1.객체의 설계도 역할. new Car() - 설계된대로 필드와 메소드를 가짐
 * ㄴ 설계한 class로 리모콘(객체)을 찍어냄. 똑같은 기능을 가진 다른 객체 생성
 * ㄴ 참조데이터 타입 (String PrintStream Car...
 * 2.데이터 타입의 역할
 * 3.클래스를 정확히 식별하는 방법? - 패키지명으로 구분하기. test.maypac.Car
 * 4.static 필드와 메소드를ㄹ 제공 heap영역을 참조값으로 구분되는 객체.
 * 		stack영역은 메소드 호춣마다 지역변수가 만들어짐 리턴되면 사라짐
 * `	static영역은
 */
public class Car {
	//저장소(field)
	public String name;
	//달리는 기능(method)
	public void drive() {
		System.out.println(this.name+"이(가) 달려요!");
	}
	//멈추는 기능(method) 
	public void stop() {
		System.out.println(this.name+"이(가) 멈춰요!");
		
		
	}
}
