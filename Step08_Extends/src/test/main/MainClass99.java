package test.main;

import test.mypac.Cart;
import test.mypac.SuperCar;
import test.mypac.Wheels;

public class MainClass99 {
	public static void main(String[] args) {
		Cart p1 = new SuperCar();
		p1.name="���������";
		p1.push();
		p1.getIn();
		p1.sit();
		p1.drive();

		Wheels p2 = p1; 
		p2.name="�ҿ�";
		p2.push();
		
		SuperCar p3=(SuperCar)p2;
		p3.drive();
		p3.booster();
		
		
	}
}
