package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass02 {
	public static void main(String[] args) {
		//Messenger �޼ҵ� 3�� ȣ���ϱ�
		Messenger.sendMessage("bye");
		Messenger.getMessage();
		Messenger.useCar(new Car());
	}
}
