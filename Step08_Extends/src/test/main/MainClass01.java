
package test.main;

import test.mypac.HandPhone;
/*
 * Phone클래스를 상속받은 HandPhone클래스로 객체를 생성하면
 * Phone객체가 미리 만들어지고 HandPhone객체가 만들어진다
 * 
 * 그리고 그 두개의 객체가 동일한 heap영역에 저장되어서 동일한 참조값으로 관리..
 */
public class MainClass01 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		p1.call(); //Phone으로부터 상속받은 기능을 사용할 수 있다.
		p1.mobileCall();
		p1.takePicture();
		// 부모객체가 heap에 먼저 만들어지기 때문에 Phone 생성자 선호출.
		
		
	}
}
