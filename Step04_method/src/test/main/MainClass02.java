package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass02 {
	public static void main(String[] args) {
		//Messenger 메소드 3개 호출하기
		Messenger.sendMessage("bye");
		Messenger.getMessage();
		Messenger.useCar(new Car());
	}
}
