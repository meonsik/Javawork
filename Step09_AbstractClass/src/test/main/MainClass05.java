package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	static Weapon w1; //Weapon 타입 의 w1 필드 선언. 값은 null.
	static Weapon w2=new Weapon(){

		public void attack() {
			System.out.println("일단 공격");
		}//Weapon은 추상클래스. 단독 개체생성 불가.
		
	};
	
	
	public static void main(String[] args) {
//		useWeapon(w1); //static 메소드 내에서 static 자원을 사용한다.
		Weapon w3=new Weapon() { //weapon type의 참조값을 얻어내는 방법...
			public void attack() {
				System.out.println("ㄱㄱ");
				
			}
			
		};
		useWeapon(w3);
		useWeapon(new Weapon() {
	         @Override
	         public void attack() {
	            System.out.println("오잉? 이것도 공격하네?");
	         }
	      });

		
		
		
		
		
	}
	public static void useWeapon(Weapon w) {//w1의 값이 null이라 객체의 키가 없어서 nullException
		w.prepare();
		w.attack();
	}
}
