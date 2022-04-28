package test.mypac;

public class MyWeapon extends Weapon{
	//추상클래스를 상속받으면 추상메소드 Override가 강제된다.
	@Override
	public void attack() {
		System.out.println("내 마음대로 공격!");
	}

}
