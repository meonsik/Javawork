package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("rhdrur");
				//WeaponŬ������ ��ӹ��� �͸� Ŭ����
				
			}
		};
			useWeapon(new Weapon() {
			
			@Override //�������̵带 ���� �͸�Ŭ����.
			public void attack() {
				System.out.println("rhd");
			}
		});
	
	
	
	
	
	}

	private static void useWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		
	}
}
