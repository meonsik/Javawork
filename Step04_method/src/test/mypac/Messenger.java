package test.mypac;

public class Messenger {
	//new Messenger 하지 않고 Messenger 해서 사용
	//String type을 인자로 전달받는 static 메소드
	public static void sendMessage(String msg) {
		System.out.println(msg+" 를 전송합니다.");
	}
	//String type을 리턴해주는 static 메소드
	public static String getMessage() {
		return "hello";
	}
	//Car type을 인자로 전달받는 static 메소드
	public static void useCar(Car c) {
		c.name="티코";
		c.drive();
	}
}
