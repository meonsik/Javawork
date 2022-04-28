package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("rhdrur");
				//Weapon클래스를 상속받은 익명 클래스
				
			}
		};
			useWeapon(new Weapon() {
			
			@Override //오버라이드를 위한 익명클래스.
			public void attack() {
				System.out.println("rhd");
			}
		});
	
	
	
	
	
	}

	private static void useWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		
	}
}
