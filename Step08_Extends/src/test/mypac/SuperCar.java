package test.mypac;

public class SuperCar extends Cart{
	public SuperCar() {
		System.out.println("부스터 기능 추가됨");
	}
	public void booster() {
		System.out.println("부스터");
	}@Override
	public void drive() {
		System.out.println(this.name+"을(를) 시속 1000km로 운전 중 . . .");
	}
}
