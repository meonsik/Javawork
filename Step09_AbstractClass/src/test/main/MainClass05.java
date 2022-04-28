package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	static Weapon w1; //Weapon Ÿ�� �� w1 �ʵ� ����. ���� null.
	static Weapon w2=new Weapon(){

		public void attack() {
			System.out.println("�ϴ� ����");
		}//Weapon�� �߻�Ŭ����. �ܵ� ��ü���� �Ұ�.
		
	};
	
	
	public static void main(String[] args) {
//		useWeapon(w1); //static �޼ҵ� ������ static �ڿ��� ����Ѵ�.
		Weapon w3=new Weapon() { //weapon type�� �������� ���� ���...
			public void attack() {
				System.out.println("����");
				
			}
			
		};
		useWeapon(w3);
		useWeapon(new Weapon() {
	         @Override
	         public void attack() {
	            System.out.println("����? �̰͵� �����ϳ�?");
	         }
	      });

		
		
		
		
		
	}
	public static void useWeapon(Weapon w) {//w1�� ���� null�̶� ��ü�� Ű�� ��� nullException
		w.prepare();
		w.attack();
	}
}
