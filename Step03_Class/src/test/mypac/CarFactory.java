package test.mypac;

public class CarFactory {
	//getCar()라는 메소드가 있다.
	public Car getCar() {
		//Car type객체의 참조값 리턴하기
		//저번에 만들었던 Car클래스를 가져오는 메소드다.
		//메소드 실행시 자동으로 c에 
		Car c=new Car();
		
		return c;
	}

}
