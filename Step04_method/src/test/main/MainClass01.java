package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject클래스에 정의된 3개의 메소드를 차례로 호출하는 code작성
		MyObject mo=new MyObject();
		
		mo.walk();
		mo.getNumber();
		mo.getGreeting();
		//담아서 사용하고 싶으면
		int num=mo.getNumber();
		String greet=mo.getGreeting();
		//Car type객체를 불러오는 메소드
		Car car=mo.getCar();
		car.name="소나타";
		
		//.setNum() .setName() .useCar() 메소드를 3개 호출하는 code
			//인자를 대입 연산자로 값을 대입하는 느낌을 받으면 됨
		mo.setNum(1); //1을 전달한다 int num=1;
		mo.setName("이름"); // String name="이름";
		mo.useCar(car); // Car car = new Car();
		
		//.listenMusic() 메소드를 호출하는 code 작성하기.
			//첫번째 인자는 Radio type, 두번째 인자는 Speaker type
		mo.listenMusic(new Radio(), new Speaker());
		
		
	}
}
