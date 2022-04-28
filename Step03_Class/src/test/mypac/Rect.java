package test.mypac;

public class Rect {

	public int width;
	public int height;
	public void showArea() {//void를 리턴합니다 (리턴없음)
		System.out.println("넓이는: "+this.width*this.height);
	}
	//면적을 호출한 곳으로 리턴하는 메소드
	public int getArea() { //int를 리턴합니다
		int area=width*height;
		return area;
	}
	
}


