
package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
//HandPhone객체를 생성해서 그 참조값을 p1이라는 이름의 HandPhone type지역변수에 대입
		HandPhone p1=new HandPhone();		
//Phone type을 담을 변수를 준비만 해둔 것.
//p2라는 이름의 Phone type 지역변수에 null값 넣기.
		Phone p2=null;
		//p1 안에 있는 참조값을 p21라는 Phone type지역 변수에 대입하기.
		Phone p21=p1;
		//p1 안에 있는 참조값을 p3라는 Object type지역 변수에 대입하기.
		Object p3=p1;
		/*
		 * 자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다.
		 */
		
	}
}
