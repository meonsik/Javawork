package test.main;

import test.mypac.Myutil;

public class MainClass02 {
	
	
	public static String myName="김구라";
	
	public static void test() {
		System.out.println("test() 호출됨");
}
	
	public static void main(String[] args) {				
		Myutil.v=1.0;
		Myutil.version=Myutil.v+"";
		Myutil.send();
		System.out.println(MainClass02.myName);
		MainClass02.test(); //this는 불가능
		//this는 heap영역에 생성되는 객체에 대한 것.
		//생성되지도 않은 객체를 this로 불러올 수 없다.
		//MainClass02.를 생략할 수 있다 이유는?
		//같은 공간 안에 존재하기 때문에.
	}

}
