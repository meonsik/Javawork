package test.auto;

public class CampingCar extends Car {
	//자식 객체가 만들어지기 위해서 
	//부모 객체가 필요한데
	//부모 객체의 생성자에 Engine이 필요하기 때문에 아래의 코드가 필요.
	public CampingCar(Engine engine) {
		//super()는 부모클래스의 생성자를 호출하는 것을 의미한다.
		super(engine);// 이 윗줄에 코드 작성시 super 에러
		
		
	}
	//메소드
	public void sleepInCar() {
		System.out.println("차에서 자기");
	}
}
