package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;
//Class Cast Exception 발생.
public class MainClass05 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1=new HandPhone();
		//엄마 나도 SmartPhone 사줘
//		SmartPhone p2=(SmartPhone)p1;
		 	//원래 객체는 HandPhone이기 때문에 SmartPhone으로 캐스트 할 수 없다.
//		p2.doInternet();
		
	}
}
