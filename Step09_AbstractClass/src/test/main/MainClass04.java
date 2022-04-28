package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	static class YourWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("���߰���");
		}
	}
	
	public static void main(String[] args) {
		//���� inner class�� �ҷ��ͺ���? new�� �ϸ�. . .���� . . .
			//static �������� ������ class�� �ڿ��� ����ϰ� ���� ���� static �ڿ��� ��밡���ϴ�.
		
			Weapon w1=new YourWeapon();
			useWeapon(w1);
			
			//static ���� ������ ������ Ŭ������ static ������ ����� �� �ִ�.
				
			class OurWeapon extends Weapon{
				public void attack() {
					System.out.println("�Ѵ� �����ϱ�");
				}
			}
			Weapon w2=new OurWeapon();
			useWeapon(w2);

	}
	public static void useWeapon(Weapon w) {
		//���� ���������� �ٸ� ��Ű������ Ŭ������ ����� ��ü�� ������ �����ߴµ�
		//�̹����� ���� Ŭ������ ���� �����غ���....
		w.prepare();
		w.attack();
	}
}
