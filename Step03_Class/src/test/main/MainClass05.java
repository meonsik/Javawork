package test.main;

import test.mypac.Rect;

/*
 * Rect라는 이름의 클래스를 만들고 싶다.
 * 
 * 해당 클래스로 객체를 생성하고
 * 
 * 사각형의 폭(width)과 높이(height)를 필드에 대입하고
 * 
 *  showArea()를 호출하면 사각형의 넓이를 콘솔창에 출력하기.
 * 
 */

public class MainClass05 {

	
	public static void main(String[] args) {
		//class로 불러온
		Rect r1=new Rect();
		r1.width=1234;
		r1.height=5678;
		r1.showArea();
		//메소드가 리턴해 주는 값을 변수에 담아보기
		int area=r1.getArea(); //호출 시 int타입으로 바뀐다.
	}
}
