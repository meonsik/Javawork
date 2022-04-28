package test.mypac;

public class SmartPhone extends HandPhone{
	//Constructor
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출됨 . . .");
	}
	//Method
	public void doInternet() {
		System.out.println("인터넷에 접속 . . .");
	}@Override //부모의 메소드 재정의
	public void takePicture() {
		System.out.println("1000만 화소 촬영 . . .");
	}
}
