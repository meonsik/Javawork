package test.main;

import test.mypac.Yamato;
import test.mypac.Weapon; 
// �߻�Ŭ������ Data Type�� ������ �����ϴ�.


public class MainClass02 {
	public static void main(String[] args) {
		//���� Ŭ������ ����� ��ü������ �ؼ� useWeapon()�޼ҵ� ȣ���ϱ�.
		//���� ���� Ŭ������ Weapon �� ��������� Weapon type�� �� �� �ִ�.
		//useWeapon�� ȣ���Ϸ��� Weapon Ÿ���� w������ �ʿ��ϴ�.
		//w�� ���ڷ� �����ؼ� ȣ���ϱ�.		
		Weapon w = new Yamato();
		useWeapon(w); 
	}
	//���� ������ ������ �ϴ� �޼ҵ��� ����.
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
