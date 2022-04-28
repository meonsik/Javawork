package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	static class YourWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("공중공격");
		}
	}
	
	public static void main(String[] args) {
		//이제 inner class를 불러와볼까? new를 하면. . .에러 . . .
			//static 영역에서 동일한 class의 자원을 사용하고 싶을 때는 static 자원만 사용가능하다.
		
			Weapon w1=new YourWeapon();
			useWeapon(w1);
			
			//static 영역 내에서 생성된 클래스는 static 내에서 사용할 수 있다.
				
			class OurWeapon extends Weapon{
				public void attack() {
					System.out.println("둘다 공격하기");
				}
			}
			Weapon w2=new OurWeapon();
			useWeapon(w2);

	}
	public static void useWeapon(Weapon w) {
		//이전 예제에서는 다른 패키지에서 클래스를 만들고 객체를 생성해 전달했는데
		//이번에는 내부 클래스를 통해 전달해보자....
		w.prepare();
		w.attack();
	}
}
