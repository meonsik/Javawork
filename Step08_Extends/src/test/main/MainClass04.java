package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
//SmartPhone 객체를 생성해서 Phone type p1이라는 지역변수에 담아보세요.
		Phone p1=new SmartPhone();
		p1.call();
		//p1참조값을 이용해서 이동 중 통화를 하고 싶다면??
			//HandPhone의 기능이 필요한데 p1은 제한된 권한을 가지고 있다.
		//Casting필요 - byte a=(byte)aInt; 이런 느낌.
		HandPhone p2=(HandPhone)p1;
		// p1과 p2의 참조값은 같다. 그러나 권한이 다른 것.
		SmartPhone p3=(SmartPhone)p1;
		p3.doInternet();
	}
}
