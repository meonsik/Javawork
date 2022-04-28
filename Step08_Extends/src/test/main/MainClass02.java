package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 지역변수나 필드 앞에 선언하는 data type은 (참조data type)
 * 
 * 지역변수나 필드 안에 들어있는 ***참조값의 사용설명서***라고 생각...
 * 
 * 그렇기 때문에 그 지역변수나 필드에 . 을 찍으면 사용설명서에 명시된 기능만 사용 가능하다.
 * 
 * java의 모든 객체는 다형성을 가진다. (type이 여러개)
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		
		
		HandPhone p1=new HandPhone();
		//어떤 객체의 참조값을 부모 type으로 받을 수 있다.
		Phone p2=new HandPhone(); //import 필요.
		Object p3=new HandPhone();
	
		//p1 모든 기능 사용 가능
		//p2,p3에는 기능 제약이 생긴다.
		
		
		
	}
}
						