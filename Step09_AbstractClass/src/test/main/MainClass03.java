package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;
/*
 * 클래스 안에 만든 클래스 : inner class
 * 메소드 안에 만든 클래스 : local inner class
 */
public class MainClass03 {
	public static void main(String[] args) {
		//zoo클래스에 있는 getMonkey()메소드를 호출해서
		//리턴 값을 m1 지역 변수에 담기.
		Zoo zoo=new Zoo();
		Monkey m1=zoo.getMonkey();
		m1.say();
		Tiger t1=zoo.getTiger();
		t1.say();
		//메소드 안에도 클래스를 정의 할 수 있다.
	class Gura{
		public void say() {
			System.out.println("안녕 나는 구라");
		}
	}
		Gura g1=new Gura();
		g1.say();
	}
}
