package test.main;

import test.auto.Engine;
import test.auto.RacingCar;

public class MainClass08 {
	public static void main(String[] args) {
		RacingCar car1=new RacingCar(new Engine());
		car1.drive();
	}
/*
 * 재정의 한 부모 메소드를 호출해야 할 지 말지는 상황에 따라 다르다.
	어떤 경우에는 부모의 메소드를 호출해 주지 않으면 
	객체가 제대로 동작하지 않을 때가 있다.
	그런 경우에는 부모 메소드 호출이 필요하다.
 */
}
