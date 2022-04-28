package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass {	
	public static void main(String[] args) {
	//	 	Remocon r=new Remocon();//인터페이스는 객체를 단독생성할 수 없다.	
			Remocon r1=new MyRemocon();	//참조값 필요하면 클래스만들어서 써야됨.
		//Remocon의 인터페이스를 구현(implements)한 클래스를 이용해서 Remocon type의 참조값 얻기
		r1.up(); r1.down();
		//인터페이스의 필드 참조 (static final)
		String result=Remocon.COMPANY;
}
}