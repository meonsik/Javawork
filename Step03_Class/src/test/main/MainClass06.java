package test.main;

import test.mypac.Car;
import test.mypac.CarFactory;

/*
 * CarFactory라는 이름의 클래스를 만들어요.
 * 
 * CarFactory 객체는 getCar()라는 메소드가 있고
 * 
 * 해당 메소드를 호출하면 Car type 객체의 참조값을 리턴하도록 메소드를 만들어보세요.
 */
public class MainClass06 {
	public static void main(String[] args) {
		CarFactory cf= new CarFactory();
		Car c=cf.getCar();
		c.name="멍멍";
		c.drive();
	}
	
}
