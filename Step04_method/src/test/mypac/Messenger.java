package test.mypac;

public class Messenger {
	//new Messenger ���� �ʰ� Messenger �ؼ� ���
	//String type�� ���ڷ� ���޹޴� static �޼ҵ�
	public static void sendMessage(String msg) {
		System.out.println(msg+" �� �����մϴ�.");
	}
	//String type�� �������ִ� static �޼ҵ�
	public static String getMessage() {
		return "hello";
	}
	//Car type�� ���ڷ� ���޹޴� static �޼ҵ�
	public static void useCar(Car c) {
		c.name="Ƽ��";
		c.drive();
	}
}
