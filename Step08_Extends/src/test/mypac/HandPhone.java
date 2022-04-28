package test.mypac;

public class HandPhone extends Phone{
	public HandPhone() {
		System.out.println("HandPhone() 생성자 호출됨 . . .");
	}
	//method
	public void mobileCall() {
		System.out.println("이동 중 통화 . . .");
	}
	//사진 찍기
	public void takePicture() {
		System.out.println("30만 화소 촬영 . . .");
	}
}
