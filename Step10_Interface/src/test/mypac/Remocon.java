package test.mypac;
/*
 * 생성자가 없다 (단독 객체 생성불가)
 * 구현된 메소드는 가질 수 없다 (추상 메소드 온리)
 * 필드는 static final 상수만 가질 수 있다.
 * data type의 역할은 할 수 있다
 * interface type의 참조값이 필요하면 구현 Implements 클래스를 만들어서 객체 생성
 * 클래스 상속은 단일 상속이지만 인터페이스는 다중 구현이 가능
 */




public interface Remocon {
	//필드
	public static final String COMPANY="LG";
	public static final double PI=3.141593;
			//인터페이스는 생성
		
		//fianl = 값이 한번 정의되면 수정불가	
			//final 필드는 관례상 다 대문자
	
	public void up(); //interface는 추상메소드만 정의할 수 있다 =.
	public void down();
}
