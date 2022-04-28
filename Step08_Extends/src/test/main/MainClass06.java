package test.main;

import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		p1.mobileCall();
		p1.doInternet();
		p1.takePicture(); // 스마트폰인데 화소가 너무 안 좋아...Override
		// 상속관계의 자식클래스에서 재정의 하는 방법 (Override)
		
	}
}
