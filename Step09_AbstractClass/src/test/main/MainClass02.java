package test.main;

import test.mypac.Yamato;
import test.mypac.Weapon; 
// 추상클래스도 Data Type의 역할은 가능하다.


public class MainClass02 {
	public static void main(String[] args) {
		//직접 클래스를 만들고 객체생성을 해서 useWeapon()메소드 호출하기.
		//직접 만든 클래스는 Weapon 을 상속했으니 Weapon type이 될 수 있다.
		//useWeapon을 호출하려면 Weapon 타입의 w변수가 필요하다.
		//w를 인자로 전달해서 호출하기.		
		Weapon w = new Yamato();
		useWeapon(w); 
	}
	//아주 복잡한 동작을 하는 메소드라고 가정.
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
